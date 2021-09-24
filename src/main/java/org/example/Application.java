package org.example;

import org.example.entity.Employee;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        deleteAll();

        Long id1 = saveEmployee(Employee.builder().fullName("EmployeeA").age(21).build());
        Long id2 = saveEmployee(Employee.builder().fullName("EmployeeB").age(22).build());
        Long id3 = saveEmployee(Employee.builder().fullName("EmployeeC").age(23).build());

        // В задаче еще было получить всех работников и вывести через Stream тех, у кого есть буква А в имени
        getAllEmployee()
                .stream()
                .filter(x -> x.getFullName().toLowerCase(Locale.ROOT).contains("a"))
                .forEach(System.out::println);

        update(Employee.builder().id(id1).fullName("EmployeeA1").age(25).build());

        deleteById(id2);

        System.out.println(findById(id3));
    }

    public static Long saveEmployee(Employee e) {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Saved " + e);
        return e.getId();
    }

    public static List<Employee> getAllEmployee() {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();
        session.close();
        System.out.println("Find " + employees.size() + " employees");
        return employees;
    }

    public static void update(Employee employee) {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee dBEmployee = session.load(Employee.class, employee.getId());
        dBEmployee.setFullName(employee.getFullName());
        dBEmployee.setAge(employee.getAge());
        session.getTransaction().commit();
        session.close();
        System.out.println("Updated " + employee);
    }

    public static void deleteById(Long id) {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee dBEmployee = findById(id);
        session.delete(dBEmployee);
        session.getTransaction().commit();
        session.close();
        System.out.println("Deleted " + dBEmployee);
    }

    public static Employee findById(Long id) {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        Employee dBEmployee = session.load(Employee.class, id);
        session.close();
        return dBEmployee;
    }

    public static void deleteAll() {
        Session session =
                HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Employee ");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("All entries deleted");
    }
}