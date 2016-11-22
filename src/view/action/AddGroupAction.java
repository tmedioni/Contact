package view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import view.form.AddGroupForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import services.GroupService;

public class AddGroupAction extends ActionSupport {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		GroupService gs = new GroupService(getWebApplicationContext());
		
		gs.create(((AddGroupForm)form).getName());
		
		return mapping.findForward("success");
	}
	
	
}
