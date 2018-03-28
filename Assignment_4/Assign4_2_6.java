import java.util.Scanner;


public class Assign4_2_6 {

	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double input = 1;
	String operator = "z";
	double input2 = 0;
	double output = 0;
	boolean error = false;
	
	System.out.println("Please enter an expression in this format 1 + 1 \n enter 0 to exit");
	
	while (input != 0.0)
	  { 
		  input = scan.nextDouble();
		if(input == 0) {
			System.out.println("EXITING PROGRAM");
			return;
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
			  error = true;
			  System.out.println("Invalid operator");
			  break;
		  }
		  
		  if(error == false)
		  System.out.println(input + " " + operator + " " + input2 + " = " + output );
		 
		  error = false;
		  System.out.println("Please enter a new Expression");
		 
          
      } 
	return;
}
}