package com.manager.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manager.customers.model.Customer;
import com.manager.customers.service.CustomerService;

@CrossOrigin()
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/create")
	public Customer create(@RequestBody Customer customer) {
		customerService.create(customer);
		return customer;
	}

	@PostMapping("/update")
	public Customer update(@RequestBody Customer customer,@PathVariable long id) {
		customerService.create(customer);
		return customer;
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getById(@PathVariable long id){
		return customerService.getById(id);
	}

	
	@DeleteMapping("/delete/{id}")
	public List<Customer> delete(@PathVariable long id) {
		customerService.delete(id);
		return getAll();
	}
	
}