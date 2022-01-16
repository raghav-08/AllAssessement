package com.org.hib.One_To_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory fact = cfg.buildSessionFactory();
Session sess= fact.openSession();
sess.beginTransaction();

Employee e1=new Employee();
e1.setName("ravi malik");
// e1.setEmployeeId(2);
e1.setEmail("ravimalik@gmail.com");

Address add = new Address();
add.setAddressLine1("G-21,Lohia nagar");
add.setCity("Ghaziabad");
add.setState("UP");
add.setCountry("India");
add.setPincode(201302);

e1.setAddress(add);
add.setEmployee(e1);
sess.save(e1);
}
}
