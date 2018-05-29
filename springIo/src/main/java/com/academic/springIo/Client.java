package com.academic.springIo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.academic.beans.Car;
import com.academic.beans.Employee;
import com.academic.beans.Person;

public class Client {
	public static void main(String[] args) {

		// Tight -coupling
		// Person p=new Person();
		// System.out.println(p.getMessage());

		// Like to access some Bean(Person) //Loose Coupling
		// Loads the beans
		// Here beans.xml file is known as bean factory container

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean.xml");

		System.out.println("Spring container initialized-------");

		// trying to Fetch the Bean
		System.out.println("Trying to Fetch Beans------");
		Person per = (Person) context.getBean("p");
		System.out.println(per.getMessage());

		System.out.println("\n\n");

		System.out.println("second Bean------");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.emp_Id + "\t" + emp.emp_Name+"\t"+emp.emp_Salary + "\t" + emp.emp_Email);

		System.out.println("\n\n\n");
		Car car = (Car) context.getBean("car");
		System.out.println(car.getModel_Number() + "\t" + car.getModel_Name());

	}
}
