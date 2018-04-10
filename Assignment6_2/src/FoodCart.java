import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class FoodCart {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> cart = new HashMap<String, Integer>();
		Scanner Scan = new Scanner(System.in);
		
		boolean quit = false;
		
		while(!quit)
		{		
			printMenu();

			String item = "";		
			while(item == "")
			{
				int input = Scan.nextInt();
				Scan.nextLine();
				item = checkInput(input);

			}
		System.out.println("How much would you like to order");
		
		
		int quantity = -1;	
		while(checkQuantity(quantity))
		{
		quantity = Scan.nextInt();
		Scan.nextLine();
		}
		editCart(cart,item,quantity);
		printCart(cart);

		exitPrompt();
		
		int exit = Scan.nextInt();
		Scan.hasNextLine();
		
		quit = checkExit(exit);

		}
		
		System.out.println("Thank you for ordering ");
		printCart(cart);
	}
		
	public static void printMenu() {
		System.out.println("What would you like to order \r\n"
				+ "1: Hamburgers \r\n"
				+ "2: Hot Dogs \r\n"
				+ "3: Sandwiches \r\n"
				+ "4: Soda \r\n"
				+ "5: Fries\r\n");
			
			
		
	}
	public static String checkInput(int input) {
		
		String item;
		
		
		switch(input) {
		case 1:
			item = "Hamburgers";
			break;
		case 2:
			item = "Hot Dogs";
			break;
		case 3:
			item = "Sandwiches";
			break;
		case 4:
			item = "Sodas";
			break;
		case 5:
			item = "Fries";
			break;
		default:
			item = "";
			System.out.println("Please choose an item from the list");
			printMenu();
			break;
		}
	
		return item;
	}
	
	public static boolean checkQuantity(int quantity) {
		
		if(quantity < 0)
		{
		System.out.println("Please enter a valid quantity");
		return true;
		}
		else
		
			
		return false;
	
		
		}
	
	public static void printCart(HashMap<String,Integer> cart) {

		System.out.println("Current cart ");
		cart.forEach((k,v) ->
		{
			
			System.out.println(v + " " + k);
			
		});
		
		
	}
	
	public static void editCart(HashMap<String,Integer> cart,String item,int quantity)
	{
		
		cart.put(item , quantity);
		
	}
	
	public static void exitPrompt() {
		
		System.out.println("Would you like to order more \r\n"
				+ "0: to exit \r\n"
				+ "1: press any key to add or edit items");
		
	}
	
	public static boolean checkExit(int exit) {
		
		boolean quit;
		
		if(exit == 0)
			quit = true;
		else
			quit = false;
		
		
		return quit;
	}
	
}
