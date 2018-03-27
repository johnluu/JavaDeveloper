import java.util.Scanner;
public class Assign5_3 {

	public static void main(String[] args) {
		System.out.println("Please enter a line");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		for(int i = 0; i < input.length(); i++)
			System.out.println(i + ": '" + input.charAt(i) +"'");

	}

}
