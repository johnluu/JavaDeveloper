package jd.mainentry;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import jd.dao.ItemDao;
import jd.dao.OrderDao;
import jd.model.Item;


public class MainPoint {
	public static void main(String[] args) throws SQLException {
		ItemDao IDao = new ItemDao();
		OrderDao ODao = new OrderDao();
		Map<Integer,Integer> cart = new HashMap<Integer,Integer>();
		List<Item> itemList = IDao.getAllItems();
		Scanner scan = new Scanner(System.in);
		int input = -1;
		int inputId = -1;
		int inputQuantity = 0;
				
		
		while(input != 5)
		{
			printSystem();
			input = scan.nextInt();
			scan.nextLine();
			
			switch(input) {
			case 1:{
				printMenu(itemList);
				break;
			}
			
			case 2:{

				for(Map.Entry<Integer, Integer>entry: cart.entrySet())
				{
					System.out.println("ITEM ID: " + entry.getKey() + "\r\n"
					+ "Quantity " + entry.getValue());
				};
				
				break;
			}
			case 3:{
				printMenu(itemList);
				System.out.println("Please choose an item ");
			inputId = scan.nextInt();
			scan.nextLine();
			Item item = checkInventory(itemList, inputId);
			if(item != null)
				{
				inputQuantity = scan.nextInt();
				scan.nextLine();
				if(checkStock(item, inputQuantity)) {
						cart.put(inputId, inputQuantity);
						System.out.println("Sucessfully added to cart ");
					}
				else
						System.out.println("Not enough in stock ");
				}
			else
					System.out.println("Item doesn't exist");
				break;
			}
			case 4:
			{
				boolean ordercreated = false;
				boolean orderupdated = false;
				
				ordercreated = ODao.createOrder(cart);				
				
				for(Map.Entry<Integer, Integer>entry: cart.entrySet())
				{
					orderupdated = IDao.updateQuantity(entry.getKey(), entry.getValue());
				};
				
				if(ordercreated && orderupdated)
				{
				System.out.println("Order successfully processed");
				}
				else
				{
				System.out.println("Order could not be processed" );
				}
				
				itemList = IDao.getAllItems();
				cart = new HashMap<Integer,Integer>();
				break;
			}
			case 5:
				System.out.println("THANK YOU!!");
				break;
				
			default:
			{
				System.out.println("invalid input");
				break;
			}
		
			}
		}
	}
	
	
	public static void printSystem() throws SQLException {
		System.out.println("Please choose an option ");
		System.out.println("1: to see Inventory");
		System.out.println("2: to see Cart");
		System.out.println("3: to add to Cart");
		System.out.println("4: to checkout");
		System.out.println("5 to exit");
	}
	
	public static void printMenu(List<Item> itemList) throws SQLException {
			System.out.println("ID|| NAME ||PRICE||QUANTITY");
		for(Item item:itemList)
			System.out.println(item.getItem_id() +" " + item.getItem_name() +" " + item.getItem_price() +" " +  item.getQuantity_in_stock());
	}
	
	public static Item checkInventory(List<Item> itemList, int id) throws SQLException {
		
	for(Item item:itemList)
		if(item.getItem_id() == id)
		{	System.out.println("You have selected");
			System.out.println(item.getItem_name() +" Price:" + item.getItem_price() +" Stock:" +  item.getQuantity_in_stock());
			System.out.println("How much would you like to add: ");
				
			
			return item;
	
			
		}
	return null;
	
}
	public static boolean checkStock(Item item, Integer quantity)
	{
		if(item.getQuantity_in_stock() < quantity)
			return false;
		
		return true;
	}
	
}
