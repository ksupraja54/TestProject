package com.uprr.customer.dao;

import com.uprr.customer.Customer;

public interface CustomerDao {
	public void insert(Customer customer);

	public Customer findByCustomerId(int custId);
}
