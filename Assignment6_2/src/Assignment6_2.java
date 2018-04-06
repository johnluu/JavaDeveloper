import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Assignment6_2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer , String>();
		map.put(0, "Blue");
		map.put(3, "Black");
		map.put(4 , "Green");
		map.put(2 , "Red");
		map.put(1 , "Orange");
		
		
		System.out.println("Keys");
		for(Integer num: map.keySet())
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("Values");
		for(String key: map.values())
			System.out.print(key + " ");
		System.out.println();
/////////////////////////////////////////
		//////////////////////////////////
		map.put(1 , "Brown");
		
		
		System.out.println("Keys");
		for(Integer num: map.keySet())
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("Values");
		for(String key: map.values())
			System.out.print(key + " ");
		System.out.println();
		
		
		Object values;
		Object keys;
		map.forEach((k,v) ->
		{
			System.out.println("Item "+ k + " = " +v);
			
		});
		
		
		////////////////////////////////
		////////////////////////////////
		
		HashMap<String, Integer> cart = new HashMap<String, Integer>();


		


		Scanner Scan = new Scanner(System.in);
		
		boolean quit = false;
		
		while(!quit)
		{		
			
		System.out.println("What would you like to order \r\n"
				+ "1: Hamburgers \r\n"
				+ "2: Hot Dogs \r\n"
				+ "3: Sandwiches \r\n"
				+ "4: Soda \r\n"
				+ "5: Fries\r\n");
			
			
		String item = "";
		boolean validInput = false;

		
		while(!validInput)
		{	
			
		int input = Scan.nextInt();
		Scan.nextLine();	
		switch(input) {
		

		case 1:
			item = "Hamburgers";
			validInput = true;
			break;
		case 2:
			item = "Hot Dogs";
			validInput = true;
			break;
		case 3:
			item = "Sandwiches";
			validInput = true;
			break;
		case 4:
			item = "Sodas";
			validInput = true;
			break;
		case 5:
			item = "Fries";
			validInput = true;
			break;
		default:
			validInput = false;
			break;
		}
	}
		System.out.println("How much would you like to order");
		
		
		int quantity = Scan.nextInt();
		Scan.nextLine();
		cart.put(item , quantity);
		System.out.println("Current cart ");
		cart.forEach((k,v) ->
		{
			
			System.out.println(v + " " + k);
			
		});

		System.out.println("Would you like to order more \r\n"
				+ "0: to exit \r\n"
				+ "1: press any key to add or edit items");
		
		int exit = Scan.nextInt();
		Scan.hasNextLine();
		
		if(exit == 0)
			quit = true;
		else
			quit = false;
		
		}

	}
	
	
}
