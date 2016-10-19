package services;

import org.hibernate.Session;

import domain.Address;
import domain.Contact;
import domain.Entreprise;
import domain.PhoneNumber;
import util.HibernateUtil;

public class DAOContact {
	


	public void create(String firstname, String lastname, String email)
	{
		Contact contact = new Contact();
		
		contact.setFirstName(firstname);
		contact.setLastName(lastname);
		contact.setEmail(email);
		
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet
		session.save(contact);
		//recharger l’objet à partir de la session
		contact=(Contact) session.load(Contact.class, contact.getId());
		//committer la transaction
		session.getTransaction().commit();
	}

	public void create(String firstname, String lastname, String email, String siret, String street, String city, String zip,
			String country, String mobile, String fixe, String bureau) {
		assert(street != null && city != null  && zip != null  && country != null && mobile != null && fixe != null && bureau != null);
		
		Contact contact;
		
		if(siret == null || siret.isEmpty())
			contact = new Contact();
		else 
		{
			Entreprise e = new Entreprise();
			e.setNumSiret(siret);
			contact = e;
		}
		
		contact.setFirstName(firstname);
		contact.setLastName(lastname);
		contact.setEmail(email);
		
		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setZip(zip);
		address.setCountry(country);
		
		contact.setAdd(address);
		
		

		
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet


		
		
		
		PhoneNumber p = new PhoneNumber();
		p.setPhoneKind("mobile");
		p.setPhoneNumber(mobile);
		p.setContact(contact);
		
		p = new PhoneNumber();
		p.setPhoneKind("fixe");
		p.setPhoneNumber(fixe);
		p.setContact(contact);
		
		p = new PhoneNumber();
		p.setPhoneKind("bureau");
		p.setPhoneNumber(bureau);
		p.setContact(contact);
		
		session.save(contact);
		
		//recharger l’objet à partir de la session
		contact=(Contact) session.load(Contact.class, contact.getId());
		//committer la transaction
		session.getTransaction().commit();
	}

	public void research(long id) {
		
	}

	public void update(long id, String prenom, String nom, String mail) {

	}

	public void delete(long id) {

		
	}
	

}
