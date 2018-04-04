
public class KidUsers implements LibraryUser{

	int age;
	String bookType;
	
	KidUsers(int Age, String BookType){
		
		age = Age;
		bookType = BookType;
		
	}
	public void registerAccount() {

		if(age>=12)
			System.out.println("You have sucessfully registered under a kids Account");
		else
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		
	}
	public void requestBook() {
		
		if(bookType == "Kids")
			System.out.println("Book Issued Succesfully, please return the book within 10 days");
		else	
			System.out.println("Opps, you are allowed to take only kids books");
	}
	
}
