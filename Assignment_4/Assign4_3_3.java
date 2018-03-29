import java.util.Scanner;

public class Assign4_3_3 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int position = 0;
		int[] array = new int[10];
		
		
		for(int i = 0; i < array.length; i++)
		{
		
			array[i] = (int) (Math.random()*100 + 1);
			if(max < array[i] )
			{
			position = i;
			max = array[i];
			}
			
		}
	
		System.out.println("Heres an array ");	
		System.out.print("[ ");	
		for(int i: array)
		{
			
			System.out.print(i + " " );
		
			
		}
		System.out.println(']');
		
		

		System.out.println("The greatest number is " + max + "\r\n"
				+ "The position is in array[" + position + "]");
	}
		
}