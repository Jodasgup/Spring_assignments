package com.spring.repository;

import java.util.List;

import com.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();// return the list of customers

}