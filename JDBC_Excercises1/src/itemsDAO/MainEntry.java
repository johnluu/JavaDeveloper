package itemsDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainEntry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		itemDao iDAO = new itemDao();
		
		
		
		
		Item itemById = iDAO.getItemById(2);
		System.out.println("ITEM BY ID \r\n"
				+ itemById.getItem_ID() + "\r\n"
				+ itemById.getItem_Name() +"\r\n"
				+ itemById.getPrice() +"\r\n"
				+ itemById.getQuantity_In_Stock() +"\r\n");
		
		
		

		List<Item> itemList = iDAO.getItemsCostingGreaterThan(2.99);
		System.out.println("ITEM GREATER THAN PRICES");
		for(Item item: itemList)
		{
			
		System.out.println(
				+ item.getItem_ID() + "\r\n"
				+ item.getItem_Name() +"\r\n"
				+ item.getPrice() +"\r\n"
				+ item.getQuantity_In_Stock() +"\r\n");
			
		}
		
		List<Item> itemList2 = iDAO.getItemsinStock();
		
		System.out.println("ITEMS IN STOCK");
		for(Item item: itemList2)
		{
			
		System.out.println(
				+ item.getItem_ID() + "\r\n"
				+ item.getItem_Name() +"\r\n"
				+ item.getPrice() +"\r\n"
				+ item.getQuantity_In_Stock() +"\r\n");
			
		}
		
		
		
	}
}
