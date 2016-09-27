package services;

import org.hibernate.Session;

import domain.Contact;
import util.HibernateUtil;

public class DAOContact {
	


	public void create(String prenom, String nom, String email)
	{
		Contact contact = new Contact();
		
		contact.setFirstName(prenom);
		contact.setLastName(nom);
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

	public void research(long id) {
		
	}

	public void update(long id, String prenom, String nom, String mail) {

	}

	public void delete(long id) {

		
	}
	

}
