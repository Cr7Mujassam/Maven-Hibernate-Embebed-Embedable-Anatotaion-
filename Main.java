package Embeded.Anatotaion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( " Session Started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Cognizant cts = new Cognizant();
        Emp_Address emp = new Emp_Address();
        emp.setPincode(800006);
        cts.setEmp(emp);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cts);
        tx.commit();
        session.close();
	}

}
