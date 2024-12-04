package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("PersonBean.xml");
		
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("PersonBean.xml"));

		PersonBean person = (PersonBean) context.getBean("personBean");

		System.out.println("Person's name: " + person.getName());

	}

}
