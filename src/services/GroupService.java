package services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.ContactGroup;

public class GroupService {
	
	public ContactGroup create(String name)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
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
