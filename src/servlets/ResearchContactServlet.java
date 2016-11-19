package servlets;

import domain.Contact;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.WebApplicationContextUtils;

import services.ContactService;

/**
 * Servlet implementation class ResearchContact
 */
public class ResearchContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResearchContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long id=0;
		
		try{
			id = Long.parseLong(request.getParameter("id"));			
		}catch(NumberFormatException ex){ // handle not a number exception
			request.setAttribute("error", "The Id must be a number");
			this.getServletContext().getRequestDispatcher("/ResearchContact.jsp").forward(request, response);			
			return;
		}		
		
		// search the contact
		Contact contact = new Contact();
		ContactService cs = new ContactService(WebApplicationContextUtils.getWebApplicationContext(getServletContext()));
		contact = cs.research(id);		
		
		// forward the result
		request.setAttribute("contact", contact);
		request.setAttribute("id", id);
		
		this.getServletContext().getRequestDispatcher("/ResearchContact.jsp").forward(request, response);
	}

}
