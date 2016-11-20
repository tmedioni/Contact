package util;

import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;
import org.springframework.beans.factory.FactoryBean;

public class HibernateStatisticsFactoryBean implements FactoryBean<Statistics> {
	private SessionFactory sessionFactory;
	
	
	public Statistics getObject() throws Exception {
		return sessionFactory.getStatistics();
	}

	public Class<?> getObjectType() {
		return Statistics.class;
	}

	public boolean isSingleton() {
		return true;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	

}
