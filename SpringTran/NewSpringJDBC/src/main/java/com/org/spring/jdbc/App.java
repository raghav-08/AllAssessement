package com.org.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext cont = new ClassPathXmlApplicationContext("Spring_Module.xml");
        
        CustomerDAO dao = (CustomerDAO) cont.getBean("customerDAO");
        
        Customer cus = new Customer(1,"ABC", 20);
        
        dao.insert(cus);
        
        Customer cus1 = dao.findByCustomerId(1);
        
        System.out.println(cus1);
        ((AbstractApplicationContext)cont).close();
    }
}
