import java.util.Scanner;

public class Assign4_3_5 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a words seperated by , to create an array");
		String s = scan.nextLine();
		String[] arr = s.split(",");
		
		System.out.print("Your string array is\n");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println("arr["+i+"] = " + arr[i] );
		
		
		}
	}
		
}