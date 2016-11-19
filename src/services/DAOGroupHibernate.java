package services;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import domain.ContactGroup;

public class DAOGroupHibernate extends HibernateDaoSupport implements IDAOGroup {

	/* (non-Javadoc)
	 * @see services.IDAOGroup#create(java.lang.String)
	 */
	public ContactGroup create(String name) {
		ContactGroup group = new ContactGroup();
		
		group.setGroupName(name);
		
		
		getHibernateTemplate().save(group);
		//recharger l’objet à partir de la session
		group=(ContactGroup) getHibernateTemplate().load(ContactGroup.class, group.getGroupId());

		return group;
	}

}
