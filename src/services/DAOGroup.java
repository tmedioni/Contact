package services;

import org.hibernate.Session;


import domain.ContactGroup;
import util.HibernateUtil;

public class DAOGroup {

	public ContactGroup create(String name) {
		ContactGroup group = new ContactGroup();
		
		group.setGroupName(name);
		
		//Obtention d’une session
		Session session =
		HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet
		session.save(group);
		//recharger l’objet à partir de la session
		group=(ContactGroup) session.load(ContactGroup.class, group.getGroupId());
		//committer la transaction
		session.getTransaction().commit();
		
		return group;
	}

}