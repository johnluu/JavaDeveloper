
public class Employee {

	
	
protected long employeeId;
protected String employeeName;
protected String employeeAddress;
protected long employeePhone;
protected double basicSalary;
protected double specialAllowance = 250.80;
protected double Hra = 1000.50;


Employee()
{	
	String employeeName = " ";
	String employeeAddress = " ";
	long employeePhone = 00000000;
	double basicSalary = 0;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
}

Employee(long Id, String Name,String address,long phone )
{	
	
	employeeId = Id;
	employeeName = Name;
	employeeAddress = address;
	employeePhone = phone;
}


public double calculateSalary(){
	
	return basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
}

public double calculatetransportAllowance() {
	
	

	return 10*basicSalary/100;
}
}
