import java.util.Scanner;

public class Assign4_3_5 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a words seperated by , to create an array");
		String s = scan.nextLine();
		String[] arr = s.split(",");
		
		System.out.print("Your array \n"
				+ "[");
		for(String temp: arr)
			System.out.print(temp + " ");
		
		System.out.println("]");
		
	}
		
}