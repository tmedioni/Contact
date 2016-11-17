package services;

import domain.Address;
import domain.Contact;

public interface IDAOContact {

	void create(String firstname, String lastname, String email);

	void create(String firstname, String lastname, String email, Address add);
	
	void create(String firstname, String lastname, String email, String siret, String street, String city, String zip,
			String country, String mobile, String fixe, String bureau);

	Contact research(long id);

	void update(long id, String prenom, String nom, String mail);

	void delete(long id);

}