package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

	private Configuration con;
	private SessionFactory factory;
	private Session session;
	private Transaction t;
	
	public void saveData(Employee e) 
	{
		con = new Configuration().configure("hibernate.cfg.xml");
		factory = con.buildSessionFactory();
		session = factory.openSession();
		t = session.beginTransaction();
		session.save(e);
		t.commit();
	}
}
