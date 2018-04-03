
public class InheritanceActivity {

	public static void main(String[] args)
	{
		
		Employee A = new Manager(126534 , "Peter","Chennai india", 237844 , 65000);
		
		Employee B = new Trainee(29846, "Jack" , "Mumbai India", 442085, 45000 );
		
		System.out.println("Salaries ");
		System.out.println(A.calculateSalary());
		System.out.println(B.calculateSalary());

		System.out.println("Transport Allowance ");
		System.out.println(A.calculatetransportAllowance());
		System.out.println(B.calculatetransportAllowance());	
	
	}
	
}
