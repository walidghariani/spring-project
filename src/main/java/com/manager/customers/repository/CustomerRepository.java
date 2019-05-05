package com.manager.customers.repository;

import org.springframework.data.repository.CrudRepository;

import com.manager.customers.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
}
