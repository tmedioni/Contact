package view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import services.ContactService;
import view.form.AddContactForm;

public class AddContactAction extends ActionSupport {

	@SuppressWarnings("deprecation")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		AddContactForm contactform = (AddContactForm) form;
		
		try
		{
			ContactService cs = new ContactService(getWebApplicationContext());
			if(contactform.getStreet() == null || contactform.getStreet().length() < 1)
			{
				cs.create(contactform.getFirstname(), contactform.getLastname(), contactform.getEmail(), contactform.getSiret());
			}
			else
			{
				cs.create(contactform.getFirstname(), contactform.getLastname(), contactform.getEmail(), contactform.getSiret(), contactform.getStreet(),
						contactform.getCity(), contactform.getZipcode(), contactform.getCountry(), contactform.getMobile(), contactform.getFixe(), contactform.getBureau());
			}
			
		} catch(Exception e)
		{
		
		}
		
		return mapping.findForward("success");
	}

}
