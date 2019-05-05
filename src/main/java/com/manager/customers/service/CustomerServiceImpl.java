package com.manager.customers.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.customers.model.Customer;
import com.manager.customers.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}

	@Override
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);

	}

}
