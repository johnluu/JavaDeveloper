import java.util.Scanner;

public class Assign4_1_3{


	
	public static void main(String[] args) {
	
		// If is checking the comparison is true
		// Else is checking the comparisons that were false
		// Else if is checking if the comparison is false and throwing another comparison
		// If you remove the else from else if it just checks the statement without first checking the initial statement
		
		Scanner scan = new Scanner(System.in);
		
		int cars = 5;
		int people = 6;
		int buses = 3;
		
		if(cars > people)
			System.out.println("We should take the cars");
		else if(cars < people)
			System.out.println("We should not take the cars");
		else
			System.out.println("We still can't decide");

		
		if(buses > cars)
			System.out.println("That's too many buses");
		else if(buses < cars)
			System.out.println("Maybe we should take the buses");
		else
			System.out.println("We still can't decide");

		if(people > buses)
			System.out.println("Alright, lets just take the buses");
		else
			System.out.println("Let's just take the cars");
	}
}
