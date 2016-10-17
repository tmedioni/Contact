package services;

import domain.ContactGroup;

public class GroupService {
	
	public ContactGroup create(String name)
	{
		DAOGroup g = new DAOGroup();
		return g.create(name);
	}
	
	public void research()
	{}
	
	public void update()
	{}
	
	public void delete()
	{}

}
