package services;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import domain.Address;
import domain.Contact;
import domain.Entreprise;
import domain.PhoneNumber;
import util.HibernateUtil;

public class DAOContact implements IDAOContact {
	


	/* (non-Javadoc)
	 * @see services.IDAOContact#create(java.lang.String, java.lang.String, java.lang.String)
	 */
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
	
	public void create(String firstname, String lastname, String email, Address add) {
		Contact contact = new Contact();
		
		contact.setFirstName(firstname);
		contact.setLastName(lastname);
		contact.setEmail(email);
		
		
		contact.setAdd(add);
		
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
	

	/* (non-Javadoc)
	 * @see services.IDAOContact#create(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public void create(String firstname, String lastname, String email, String siret, String street, String city, String zip,
			String country, String mobile, String fixe, String bureau) {
		assert(street != "" && city != ""  && zip != ""  && country != "" && mobile != "" && fixe != "" && bureau != "");
		
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

	/* (non-Javadoc)
	 * @see services.IDAOContact#research(long)
	 */
	public void research(long id) {
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		// Fetch contact
		Query query = session.createQuery("from Contact");
		Iterator contacts = query.iterate();
		while(contacts.hasNext())
		{
			Contact c = (Contact) contacts.next();
			System.out.println("nom="+c.getFirstName());
		}
		
	}

	/* (non-Javadoc)
	 * @see services.IDAOContact#update(long, java.lang.String, java.lang.String, java.lang.String)
	 */
	public void update(long id, String prenom, String nom, String mail) {

	}

	/* (non-Javadoc)
	 * @see services.IDAOContact#delete(long)
	 */
	public void delete(long id) {

		
	}


	

}
