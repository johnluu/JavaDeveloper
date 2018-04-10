
public class LetterToConsole {

	public static void main(String[] args)
	{
		String name = "Johnson Luu";
		String address1 = "121 Address way";
		String address2 = "Brooklyn, Ny 11111";
		printBorder();
		printSender();
		printEdge();
		formatAddress(name);
		formatAddress(address1);
		formatAddress(address2);
		
		printBorder();
	}
	
	public static void printBorder()
	{
		System.out.print("+");
		for(int i = 0 ; i < 31; i++)
		{
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
		
	}
	public static void printSender() {
		
		for(int i = 0 ; i < 3; i++)
		{
		System.out.print("|");
		System.out.format("%31s", "####");
		System.out.print("|");
		System.out.println();
		}
		
	}
	
	public static void printEdge() {
		
		for(int i = 0 ; i < 3; i++)
		{
		System.out.print("|");
		System.out.format("%31s", "");
		System.out.print("|");
		System.out.println();
		}
		
	}
	
	public static void formatAddress(String s)
	{
		System.out.print("|");
		System.out.format("%28s", s);
		System.out.print("   |");
		System.out.println();
		
	}
}
