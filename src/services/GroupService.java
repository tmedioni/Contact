package services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.ContactGroup;

public class GroupService {
	ApplicationContext context = null;
	
	public GroupService(ApplicationContext context)
	{
		this.context = context;
	}
	
	public ContactGroup create(String name)
	{
		IDAOGroup g = (IDAOGroup) context.getBean("daogroup");
		
		return g.create(name);
	}
	
	public void research()
	{}
	
	public void update()
	{}
	
	public void delete()
	{}

}
