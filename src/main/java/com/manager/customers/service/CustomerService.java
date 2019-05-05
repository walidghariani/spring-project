package com.manager.customers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manager.customers.model.Customer;

@Service
public interface CustomerService {

	public List<Customer> getAll();

	public Customer getById(Long id);

	public void create(Customer customer);

	public void delete(Long id);
}
