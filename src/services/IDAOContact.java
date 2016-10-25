package services;

import domain.Address;

public interface IDAOContact {

	void create(String firstname, String lastname, String email);

	void create(String firstname, String lastname, String email, Address add);
	
	void create(String firstname, String lastname, String email, String siret, String street, String city, String zip,
			String country, String mobile, String fixe, String bureau);

	void research(long id);

	void update(long id, String prenom, String nom, String mail);

	void delete(long id);

}