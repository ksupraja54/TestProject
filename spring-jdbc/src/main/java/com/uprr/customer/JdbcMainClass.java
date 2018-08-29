package com.uprr.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uprr.customer.dao.CustomerDao;

public class JdbcMainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		CustomerDao customerDAO = (CustomerDao) context.getBean("customerDao");
		Customer customer = new Customer(1, "mkyong", 28);
		customerDAO.insert(customer);

		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);

	}
}
