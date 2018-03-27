public class Assign5_7 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++)
		{
			
		for (int j = 0;j < 8; j++)
			System.out.print("8");
		
		
			System.out.println();
		}
		System.out.println("\n");
		
/////////////////////////////////////////////////
		
		
		for(int i = 4; i > 0; i--)
		{
			
		for (int j = 0;j < i; j++)
			System.out.print("8");
		
		
			System.out.println();
		}
		System.out.println("\n");
/////////////////////////////////////////////////
		
		for(int i = 7; i > 0; i--)
		{
			
		for (int j = 0;j < Math.ceil(i/2); j++)
			System.out.print(" ");
		
		
			System.out.println("8");
		}
	}
	
}