package services;

import java.util.List;

import domain.Address;
import domain.Contact;

public interface IDAOContact {

	boolean create(String firstname, String lastname, String email, String siret, String groupName);

	boolean create(String firstname, String lastname, String email, Address add);
	
	boolean create(String firstname, String lastname, String email, String siret, String street, String city, String zip,
			String country, String mobile, String fixe, String bureau, String groupName);

	Contact research(long id);

	boolean update(long id, String prenom, String nom, String mail);

	boolean delete(long id);
	public List<Contact> list(int param, int choix);
}