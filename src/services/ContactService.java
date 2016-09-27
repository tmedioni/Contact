package services;

public class ContactService {

	public void create(String prenom, String nom, String email)
	{
		DAOContact c = new DAOContact();
		c.create(prenom, nom, email);
	}

	public void research(long id) {
		DAOContact c = new DAOContact();
		c.research(id);
		
	}

	public void update(long id, String prenom, String nom, String mail) {
		DAOContact c = new DAOContact();
		c.update(id, prenom, nom, mail);
		
		
	}

	public void delete(long id) {
		DAOContact c = new DAOContact();
		c.delete(id);
		
	}	
}
