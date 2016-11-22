package view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.struts.ActionSupport;

import domain.Contact;
import services.ContactService;

public class TestSpringAction extends ActionSupport {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dataset.xml"});
		Contact c = (Contact) context.getBean("beanContact");
		
		
		ContactService cs = new ContactService(getWebApplicationContext());
		
		cs.create(c.getFirstName(), c.getLastName(), c.getEmail(), c.getAdd());
		
		return mapping.findForward("success");
		
	}

}
