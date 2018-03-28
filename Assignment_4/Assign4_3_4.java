import java.util.Scanner;

public class Assign4_3_4 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		int[] newstuff = new int[10];
		
		
		for(int i = 0; i < newstuff.length; i++)
			
		
			newstuff[i] = (int) (Math.random()*10 + 1);
		
		
	
		System.out.println("Heres an array ");	
		System.out.print("[ ");	
		for(int i: newstuff)
		{
			
			System.out.print(i + " " );
		
			
		}
		System.out.println(']');
		System.out.println("Search for a number and return the count in the array");
		int input = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i < newstuff.length; i++)
		{
			if(newstuff[i] == input)
			
			count++;
		
			
		}
		System.out.println("It shows up " + count + " times");

	}
}