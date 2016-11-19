package services;


import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import domain.Address;
import domain.Contact;
import domain.Entreprise;
import domain.PhoneNumber;
import util.HibernateUtil;

public class DAOContactHibernate extends HibernateDaoSupport implements IDAOContact {
	


	/* (non-Javadoc)
	 * @see services.IDAOContact#create(java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean create(String firstname, String lastname, String email)
	{
		Contact contact = new Contact();
		
		contact.setFirstName(firstname);
		contact.setLastName(lastname);
		contact.setEmail(email);
		
		
		
		
		try{
			getHibernateTemplate().save(contact);
			contact=(Contact) getHibernateTemplate().load(Contact.class, contact.getId());

			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean create(String firstname, String lastname, String email, Address add) {
		Contact contact = new Contact();
		
		contact.setFirstName(firstname);
		contact.setLastName(lastname);
		contact.setEmail(email);
		
		
		contact.setAdd(add);
		

		
		
		try{
			getHibernateTemplate().save(contact);
			contact=(Contact) getHibernateTemplate().load(Contact.class, contact.getId());
			
			return true;
		}catch(Exception e){
			return false;
		}
	}
	

	/* (non-Javadoc)
	 * @see services.IDAOContact#create(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean create(String firstname, String lastname, String email, String siret, String street, String city, String zip,
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
		
		
		try{
			getHibernateTemplate().save(contact);
			contact=(Contact) getHibernateTemplate().load(Contact.class, contact.getId());
			return true;
		}catch(Exception e){			
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see services.IDAOContact#research(long)
	 */
	public Contact research(long id) {
		Contact contact = new Contact();
		
		
		contact = (Contact) getHibernateTemplate().get(Contact.class, id);		
		return contact;		
	}

	/* (non-Javadoc)
	 * @see services.IDAOContact#update(long, java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean update(long id, String prenom, String nom, String mail) {
		Contact contact = new Contact();
		

		contact = (Contact) getHibernateTemplate().get(Contact.class, id);
		// Update contact infos
		contact.setLastName(prenom);
		contact.setFirstName(nom);
		contact.setEmail(mail);
		
			
		try{
			
			getHibernateTemplate().update(contact);	
			return true;
		}catch(Exception e){
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see services.IDAOContact#delete(long)
	 */
	public boolean delete(long id) {
		Contact contact = new Contact();
		
	
		contact = (Contact) getHibernateTemplate().get(Contact.class, id);
		
		
		try{
			// Delete Contact number id
			getHibernateTemplate().delete(contact);		
			return true;
		}catch(Exception e){
			return false;
		}
	}


	

}
