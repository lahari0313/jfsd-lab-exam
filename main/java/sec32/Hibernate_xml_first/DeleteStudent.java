package sec32.Hibernate_xml_first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = (Student) session.get(Student.class, 2);

        if (s != null) {
            session.delete(s);
            tx.commit();
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Student not found");
            tx.rollback();
        }
        session.close();
        factory.close();
    }
}