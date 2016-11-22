package view.action;

import java.util.List;

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
import view.form.ListContactForm;

@SuppressWarnings("deprecation")
public class ListContactAction extends ActionSupport {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

				List<Contact> contacts = null;
				ContactService cs = new ContactService(WebApplicationContextUtils.getWebApplicationContext(getServletContext()));
				contacts = cs.list(Integer.parseInt(((ListContactForm) form).getParam()),
						(Integer.parseInt(((ListContactForm) form).getChoix())));		
				
				// forward the result
				request.setAttribute("contact", contacts);
				request.setAttribute("choix", Integer.parseInt(((ListContactForm) form).getChoix()));
		
		return mapping.findForward("success");
	}
}
