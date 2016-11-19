package services;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Address;
import domain.Contact;

public class ContactService {

	/**********************************************************************************************************/
	
	public boolean create(String firstname, String lastname, String email)
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.create(firstname, lastname, email);
	}

	public boolean create(String firstname, String lastname, String email, Address add) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.create(firstname, lastname, email, add);
		
	}
	
	public boolean create(String firstname, String lastname, String email, String siret,
			String street, String city, String zip, String country, String mobile, String fixe, String bureau) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.create(firstname, lastname, email, siret, street, city, zip, country, mobile, fixe, bureau);
	}

	/**************************************************************************************************************/
	
	public Contact research(long id) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.research(id);
	}

	public boolean update(long id, String firstname, String lastname, String mail) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.update(id, firstname, lastname, mail);
		
		
	}

	public boolean delete(long id) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		IDAOContact c = (IDAOContact) context.getBean("daocontact");
		
		return c.delete(id);
		
	}

	
}
