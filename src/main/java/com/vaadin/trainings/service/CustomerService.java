package com.vaadin.trainings.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import artix.ru.customer.samples.backend.model.Customer;
import artix.ru.customer.samples.backend.model.Gender;
import artix.ru.customer.samples.backend.service.ICustomerService;

public class CustomerService {
	
	
	private static Customer buildCustomer() {
		Customer customer_local = new Customer();
		customer_local.setFirstName("Иван");
		customer_local.setLastName("Иванов");
		customer_local.setGender(Gender.Мужской);
		String dateString = "3/2/12";
		DateFormat format = new SimpleDateFormat("d/MM/yy");
		Date dateObject = null;
		try {
			dateObject = format.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customer_local.setDateBirthday(dateObject);
		return customer_local;
	}
	
	public static List<Customer> getList() {
		List<Customer> customerList = new ArrayList<>();
		ICustomerService cs = new artix.ru.customer.samples.backend.service.CustomerService();
		while (customerList.size() < 10) {
			Customer c = buildCustomer();
			customerList.add(c);
		}
		return customerList;
	}
}