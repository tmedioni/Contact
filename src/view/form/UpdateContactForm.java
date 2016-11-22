package view.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UpdateContactForm extends ActionForm {
	private String id;
	private String firstname;
	private String lastname;
	private String mail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String email) {
		this.mail = email;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		id = null;
		mail = null;
		firstname = null;
		lastname = null;
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
		if(mail == null || mail.length() <  1)
		{
			errors.add("id", new ActionMessage("error.email.required"));
		}
		if(lastname == null || lastname.length() <  1)
		{
			errors.add("id", new ActionMessage("error.lastname.required"));
		}
		if(firstname == null || firstname.length() <  1)
		{
			errors.add("id", new ActionMessage("error.firstname.required"));
		}
		
		return errors;
	}
	
	
}
