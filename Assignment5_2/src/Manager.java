
public class Manager extends Employee
{


Manager(long id,String Name,String address,long phone,double salary)
{
	super(id,Name,address,phone);
	basicSalary = salary;
}	

public double calculatetransportAllowance() {
	
	

	return 15*basicSalary/100;
}
}



