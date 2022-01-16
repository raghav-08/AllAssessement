package com.org.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

public class JdbcCustomerDAO implements CustomerDAO
{
	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		String sql="insert into customer1(cust_id, name, age) values(?,?,?)";
		Connection con=null;
		try
		{
			con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,customer.getCustid());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.execute();
			ps.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Customer findByCustomerId(int custid) {
		// TODO Auto-generated method stub
		String sql = "Select * from customer1 where cust_id=?";
		Connection con = null;
		try
		{
			con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, custid);
			Customer customer = null;
			ResultSet rs = ps .executeQuery();
			
			if(rs.next())
			{
				customer = new Customer(rs.getInt("cust_id"),rs.getString("Name"),rs.getInt("Age"));
			}
			rs.close();
			ps.close();
			return customer;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
}
