package services;

public class ContactService {

	public void create(String firstname, String lastname, String email)
	{
		DAOContact c = new DAOContact();
		c.create(firstname, lastname, email);
	}

	public void create(String firstname, String lastname, String email, String street, String city, String zip, String country) {
		DAOContact c = new DAOContact();
		c.create(firstname, lastname, email, street, city, zip, country);
	}

	public void research(long id) {
		DAOContact c = new DAOContact();
		c.research(id);
		
	}

	public void update(long id, String firstname, String lastname, String mail) {
		DAOContact c = new DAOContact();
		c.update(id, firstname, lastname, mail);
		
		
	}

	public void delete(long id) {
		DAOContact c = new DAOContact();
		c.delete(id);
		
	}	
}
