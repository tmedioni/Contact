package view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.struts.ActionSupport;

import services.ContactService;
import view.form.UpdateContactForm;

public class UpdateContactAction extends ActionSupport {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UpdateContactForm f = (UpdateContactForm)form;
		
		ContactService cs = new ContactService(getWebApplicationContext());
		cs.update(Long.parseLong(f.getId()), f.getFirstname(), f.getLastname() , f.getMail());
		
		return mapping.findForward("success");
	}

}
