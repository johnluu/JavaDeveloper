import java.util.Scanner;

public class Assign4_3_2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		int[] array = new int[10];
		
		
		for(int i = 0; i < array.length; i++)
			
		
			array[i] = (int) (Math.random()*10 + 1);
		
		
	
		System.out.println("Heres an array ");	
		System.out.print("[ ");	
		for(int i: array)
		{
			
			System.out.print(i + " " );
		
			
		}
		System.out.println(']');
		System.out.println("Search for a number and return the spot it is in");
		int input = scan.nextInt();
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == input)
			
			System.out.println("Found in Array [" + i  + "]");
		
			
		}
	}
		
}