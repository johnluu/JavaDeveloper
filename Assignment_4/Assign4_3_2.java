import java.util.Scanner;

public class Assign4_3_2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		int[] newstuff = new int[10];
		
		
		for(int i = 0; i < newstuff.length; i++)
			
		
			newstuff[i] = (int) (Math.random()*100 + 1);
		
		
	
		System.out.println("Heres an array ");	
		System.out.print("[ ");	
		for(int i: newstuff)
		{
			
			System.out.print(i + " " );
		
			
		}
		System.out.println(']');
		System.out.println("Search for a number and return the spot it is in");
		int input = scan.nextInt();
		
		for(int i = 0; i < newstuff.length; i++)
		{
			if(newstuff[i] == input)
			
			System.out.print(i + " " );
		
			
		}
	}
		
}