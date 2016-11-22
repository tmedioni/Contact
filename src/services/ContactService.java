package services;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import domain.Address;
import domain.Contact;

public class ContactService {
	ApplicationContext context = null;
	/**********************************************************************************************************/
	public ContactService(ApplicationContext context)
	{
		this.context = context;
	}
	public boolean create(String firstname, String lastname, String email, String siret)
	{
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.create(firstname, lastname, email, siret);
	}

	public boolean create(String firstname, String lastname, String email, Address add) 
	{		
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.create(firstname, lastname, email, add);
		
	}
	
	public boolean create(String firstname, String lastname, String email, String siret,
			String street, String city, String zip, String country, String mobile, String fixe, String bureau) {

		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.create(firstname, lastname, email, siret, street, city, zip, country, mobile, fixe, bureau);
	}

	/**************************************************************************************************************/
	
	public Contact research(long id) {
		
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.research(id);
	}

	public boolean update(long id, String firstname, String lastname, String mail) {
		
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.update(id, firstname, lastname, mail);
		
		
	}

	public boolean delete(long id) {
		
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.delete(id);
		
	}

	public List<Contact> list(int param, int choix) {
		
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.list(param, choix);
	}
	
}
