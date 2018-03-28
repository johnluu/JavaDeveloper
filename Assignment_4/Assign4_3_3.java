import java.util.Scanner;

public class Assign4_3_3 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int position = 0;
		int[] newstuff = new int[10];
		
		
		for(int i = 0; i < newstuff.length; i++)
		{
		
			newstuff[i] = (int) (Math.random()*100 + 1);
			if(max < newstuff[i] )
			{
			position = i;
			max = newstuff[i];
			}
			
		}
	
		System.out.println("Heres an array ");	
		System.out.print("[ ");	
		for(int i: newstuff)
		{
			
			System.out.print(i + " " );
		
			
		}
		System.out.println(']');
		
		

		System.out.println("The greatest number is " + max + "\r\n"
				+ "The position is in array[" + position + "]");
	}
		
}