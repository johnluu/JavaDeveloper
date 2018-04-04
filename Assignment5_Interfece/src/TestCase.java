
public class TestCase {

	public static void main(String[] args) {

		System.out.println("TEST CASE 1 ");
		
		LibraryUser k1 = new KidUsers(11,"Kids");
		k1.registerAccount();
		k1.requestBook();

		LibraryUser k2 = new KidUsers(18,"Fiction");
		k2.registerAccount();
		k2.requestBook();

		System.out.println("\n\nTEST CASE 2 ");
		
		LibraryUser a1 = new AdultUser(5,"Kids");
		k1.registerAccount();
		k1.requestBook();

		LibraryUser a2 = new AdultUser(23,"Fiction");
		k2.registerAccount();
		k2.requestBook();

	}

}
