package view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.struts.ActionSupport;

import domain.Contact;
import services.ContactService;
import view.form.ResearchContactForm;

@SuppressWarnings("deprecation")
public class ResearchContactAction extends ActionSupport {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

				Contact contact = null;
				ContactService cs = new ContactService(WebApplicationContextUtils.getWebApplicationContext(getServletContext()));
				contact = cs.research(Long.parseLong(((ResearchContactForm) form).getId()));		
				
				// forward the result
				request.setAttribute("contact", contact);
				request.setAttribute("id", Long.parseLong(((ResearchContactForm) form).getId()));
		
		return mapping.findForward("success");
	}
}
