package com.org.spring.jdbc;

public class Customer
{
	int custid;
	public Customer(int custid, String name, int age) {
		super();
		this.custid = custid;
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
