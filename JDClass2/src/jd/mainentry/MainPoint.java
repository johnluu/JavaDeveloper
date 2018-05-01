package jd.mainentry;

import java.sql.SQLException;
import java.util.List;

import jd.dao.CustomerDao;
import jd.dao.ItemDao;
import jd.model.Customer;
import jd.model.Item;

public class MainPoint {

	public static void main(String[] args) throws SQLException
	{
		CustomerDao c = new CustomerDao();
		ItemDao i = new ItemDao();
		List<Item> itemList = i.getAllItems();

		
		
		//System.out.println(i.addItem(new Item("ChocoCe",8,11.99)));
		i.delete(5);
		
		
	}
}
