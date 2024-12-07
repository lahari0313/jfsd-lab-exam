package sec32.Hibernate_xml_first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectStudent {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Student s = (Student) session.get(Student.class, 2);
           if(s!=null) {
            System.out.println("Student Details:");
            System.out.println(s.getRegdno());
            System.out.println(s.getName());
            System.out.println(s.getCgpa());
           } else {
             System.out.println("Student not found");
           }
        session.close();
        factory.close();
    }
}