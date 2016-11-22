package view.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ResearchContactForm extends ActionForm {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		id = null;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		
		if(id == null)
		{
			errors.add("id", new ActionMessage("research.invalid.id"));
		}
		try
		{
			Long.parseLong(id);
		} catch(NumberFormatException e)
		{
			errors.add("id", new ActionMessage("research.invalid.id"));
		}
		
		return errors;
	}
	
	
}
