import java.util.Scanner;


public class Assign5_6 {

	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double input = 1;
	String operator = "z";
	double input2 = 0;
	double output = 0;
	
	System.out.println("Please enter an expression in this format 1 + 1 \n enter 0 to exit");
	
	while (input != 0.0)
	  { 
		
		

		  input = scan.nextDouble();
		if(input == 0) {
			System.out.println("EXITING PROGRAM");
			break;
		}
		  
		  operator = scan.next();
		  input2 = scan.nextDouble();
		  scan.nextLine();
		  
		 
		  
		  switch(operator)
		  {
		  case "+":
			  output = input + input2;
			  break;
		  case "-":
			  output = input - input2;
			  break;
		  case "/":
			  output = input / input2;
			  break;
		  case "*":
			  output = input * input2;
			  break;
		  default:
			  System.out.println("Invalid operator");
			  break;
		  }
		  
		  System.out.println(input + operator + input2 + " = " + output );
		  System.out.println("Please enter a new Expression");
		 
          
      } 
}
}