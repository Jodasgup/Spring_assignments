package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository{

	@Override
	public List<Customer> findAll() {
		// actual data will come from database ---> JDBC connecting to database and fetching the data: mysql
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Rekha");
		customer.setLastName("Vijayan");

		customers.add(customer);
		return customers;

	}

}
