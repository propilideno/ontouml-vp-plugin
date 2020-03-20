package it.unibz.inf.ontouml.vp.controllers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import it.unibz.inf.ontouml.vp.model.ModelElement;
import it.unibz.inf.ontouml.vp.utils.OntoUMLServerUtils;
import it.unibz.inf.ontouml.vp.utils.ViewUtils;

/**
 * Implementation of toolbar button action responsible for performing diagram
 * verification.
 *
 */
public class DiagramVerificationAction implements VPActionController {

	/**
	 * 
	 * Performs OntoUML diagram verification.
	 * 
	 * @param action
	 * 
	 */
	@Override
	public void performAction(VPAction action) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(new Runnable() {

			@Override
			public void run() {
				try {
					ViewUtils.clearLog(ViewUtils.SCOPE_PLUGIN);
					final String response = OntoUMLServerUtils
							.requestModelVerification(ModelElement.generateModel(true));

					if(response != null){
						ViewUtils.logDiagramVerificationResponse(response);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	/**
	 * Called when the menu containing the button is accessed allowing for action
	 * manipulation, such as enable/disable or selecting the button.
	 * 
	 * OBS: DOES NOT apply to this class.
	 */
	@Override
	public void update(VPAction action) {
	}

}