package view.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ListContactForm extends ActionForm {
	private String param;
	private String choix;

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		param = null;
		choix = null;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		
		if(param == null || choix == null)
		{
			errors.add("param", new ActionMessage("research.invalid.id"));
		}
		else if(! (param == null || choix == null) )
		{
			try
			{
				Integer.parseInt(param);
				Integer.parseInt(choix);
			} catch(NumberFormatException e)
			{
				errors.add("param", new ActionMessage("research.invalid.id"));
			}
		}
		return errors;
	}


	
	
}
