package com.org.den.Spring_Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class EmpController 
{
	@RequestMapping("/empinfo")
	public Employee Emp(@RequestParam(value="empName") String empName)
	{
		Employee e1 = new Employee();
		e1.setEmpName("Hello "+empName);
		e1.setEid(101);
		e1.setAddress("mumbai");
		return e1;
	}
}
