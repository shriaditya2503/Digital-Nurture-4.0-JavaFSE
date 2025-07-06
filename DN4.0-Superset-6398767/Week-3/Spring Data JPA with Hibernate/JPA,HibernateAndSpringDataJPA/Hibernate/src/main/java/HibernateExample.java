import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    private static SessionFactory factory;

    public static void main(String[] args) {
        factory = new Configuration().configure().buildSessionFactory();
        HibernateExample app = new HibernateExample();

        Employee emp = new Employee();
        emp.setName("Alice");
        emp.setDepartment("HR");
        emp.setSalary(60000);

        Integer empId = app.addEmployee(emp);
        System.out.println("Saved employee with ID: " + empId);
    }

    public Integer addEmployee(Employee emp) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer empId = null;

        try {
            tx = session.beginTransaction();
            empId = (Integer) session.save(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return empId;
    }
}