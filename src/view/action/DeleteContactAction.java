package view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.struts.ActionSupport;

import domain.Contact;
import services.ContactService;
import view.form.ResearchContactForm;

public class DeleteContactAction extends ActionSupport {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		ContactService cs = new ContactService(WebApplicationContextUtils.getWebApplicationContext(getServletContext()));
		boolean deleted = cs.delete(Long.parseLong(((ResearchContactForm) form).getId()));		
		
		
		return mapping.findForward("success");
	}

}
