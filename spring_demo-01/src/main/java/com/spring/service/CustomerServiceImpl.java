package com.spring.service;

import java.util.List;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import com.spring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository cs = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return cs.findAll();
	}

}
