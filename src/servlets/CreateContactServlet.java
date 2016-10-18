package servlets;


import services.ContactService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateContactServlet
 */
public class CreateContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateContactServlet() {
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
		// TODO Auto-generated method stub
		
		//Verifier input
		String prenom = request.getParameter("prenom");
		String nom    = request.getParameter("nom");
		String mail   = request.getParameter("mail");
		
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String country = request.getParameter("country");
		
		String mobile = request.getParameter("mobile");
		String fixe   = request.getParameter("fixe");
		String bureau = request.getParameter("bureau");
		
		ContactService cs = new ContactService();
		cs.create(prenom, nom , mail, street, city, zip, country, mobile, fixe, bureau);
		
		response.sendRedirect("index.html");
		
	}

}
