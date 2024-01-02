package Practise.Hibernate.copy;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class App {
 
	public static void main(String[] args) {
//		
//		Student st=new Student();
//		st.setUsn(10);
//		st.setName("Varsha");
//		st.setMarks(99.9);
		Emp e= new Emp();
		e.seteName("Varsha");
		e.seteSal(800000);
		e.setX(20);
    Configuration configuration = new Configuration();
    configuration.configure("hibernate.cfg.xml");
    SessionFactory buildSessionFactory = configuration.buildSessionFactory();
    Session session = buildSessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.save(e);
    tx.commit();
//    Emp load = openSession.load(Emp.class, 1);
//    System.out.println(load);
    session.close();
    buildSessionFactory.close();
 
	}
 
}