package com.org.boot.empApp;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO 
{
	public static Employees List = new Employees();
	
	static 
	{
		List.getEmployeeList().add(new Employee(1,"a","b","abc"));
		List.getEmployeeList().add(new Employee(2,"x","y","xyz"));
		
	}
	public Employees getAllEmployees()
	{
		return List;
	}
	public void addEmployee(Employee employee)
	{
		List.getEmployeeList().add(employee);
	}
}
