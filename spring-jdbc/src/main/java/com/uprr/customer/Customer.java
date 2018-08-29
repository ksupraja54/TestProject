package com.uprr.customer;

public class Customer {
	private int custId;
	private String name;
	private int age;

	public Customer(int custId, String name, int age) {
		this.setAge(age);
		this.setCustId(custId);
		this.setName(name);
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
