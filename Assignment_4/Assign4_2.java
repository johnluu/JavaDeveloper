import java.util.Scanner;

public class Assign4_2{


	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey, Whats your name");
		String name = scan.nextLine();
		System.out.println("How old are you");
		int age = scan.nextInt();
	
		if(age >= 25)
			System.out.println("You can do anything thats legal, "+ name);
		if(age < 25)
			System.out.println("You can't rent a car, "+ name);
		if(age < 18)
			System.out.println("You can't vote, " + name );
		if(age < 16)
			System.out.println("You can't drive, " + name);
		
		scan.close();
		
		return;
	}
}