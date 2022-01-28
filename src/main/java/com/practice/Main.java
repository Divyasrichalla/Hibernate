package com.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {
	// write your code here

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Employee emp1 = new Employee();
		emp1.setEmp_id(01);
		emp1.setMobile("044");
		emp1.setName("Sri");
		emp1.setTeam("NOM");

		session.persist(emp1);
		t.commit();

		System.out.println("Successfully updated");

		Employee employee = session.load(Employee.class, 02);
		System.out.println(employee);
		/*System.out.println("name of the employee is: "+employee.getName());
		System.out.println("ID of the employee is: "+employee.getEmp_id());
		System.out.println("Team name of the employee is: "+employee.getTeam());
		System.out.println("mobie numbr of the employee is: "+employee.getMobile());*/

    }
}
