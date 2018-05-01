package jd.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jd.model.Customer;
import jd.utils.OracleQueries;

public class CustomerDao {

	public Customer getCustomerById(int id) throws SQLException
	{
		Customer cust = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETCUSTOMERBYID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			if(result.next()) {
			cust = new Customer(result.getInt(1), result.getString(2), result.getString(3),result.getString(4));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			result.close();
		if(stmt != null) 
		{
			stmt.close();
		}
		if(conn != null)
		{
			conn.close();
		}
		
	}
		
		return cust;
		
	}
	
	public Integer register(Customer cust) throws SQLException {
		Integer ID = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String[] COL = {"customer_id"};
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.SAVECUSTOMER, COL);
			stmt.setString(1, cust.getCustomer_email());
			stmt.setString(2, cust.getCustomer_fname());
			stmt.setString(3, cust.getCustomer_lname());
			stmt.executeUpdate();
			result = stmt.getGeneratedKeys();
			
			if(result != null && result.next()) {
				ID = result.getInt(1);
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			result.close();
		if(stmt != null) 
		{
			stmt.close();
		}
		if(conn != null)
		{
			conn.close();
		}
	}
		return ID;
	}
	
	public void delete(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELETECUSTOMER);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		if(stmt != null) 
		{
			stmt.close();
		}
		if(conn != null)
		{
			conn.close();
		}
	}
		return;
	}
		
}
