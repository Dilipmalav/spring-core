package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.ioc.Order1;

public class TestMultiple {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");

		UserBean user = (UserBean) context.getBean("user"); // context.getBean(UserBean.class);

		PersonBean person = (PersonBean) context.getBean("personBean"); // context.getBean(Person.class);
     
		Order1 order = (Order1) context.getBean("order1");

		
		System.out.println("User Name: " + user.getLogin());
		System.out.println("User Password: " + user.getPassword());
		System.out.println("Person Name: " + person.getName());
		
		

		order.bookATicket(6);
	}

}
