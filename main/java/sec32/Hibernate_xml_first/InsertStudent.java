package sec32.Hibernate_xml_first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

  public static void main(String[] args) {
  Student s = new Student();
  s.setRegdno(1);
  s.setName("sai");
  s.setCgpa(10);
  s.setRegdno(2);
  s.setName("chandu");
  s.setCgpa(9);
  s.setRegdno(3);
  s.setName("mouli");
  s.setCgpa(9);
  s.setRegdno(4);
  s.setName("lahari");
  s.setCgpa(10);
  
  
  @SuppressWarnings("deprecation")
SessionFactory factory = new Configuration().configure().buildSessionFactory();
  Session session = factory.openSession();
  Transaction tx = session.beginTransaction();
  
  session.save(s);
  
  tx.commit();
  
  
  }

}