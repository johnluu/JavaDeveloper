import java.util.Scanner;
public class Assign5_2 {
	
	public static void main (String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int i = scan.nextInt();
		if(i <= 0)
			System.out.println("HEY! That's against the rules.");

		else
		while(i > 1) {
			if(i% 2 == 1)
				i = (i+1)/2;
			else
				i = i/2;

			System.out.println(i);
		}
		
		
		return;
	}
}
