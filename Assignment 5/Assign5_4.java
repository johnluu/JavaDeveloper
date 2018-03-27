import java.util.Scanner;
public class Assign5_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a max x");
		int  x = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter a max y");
		int y = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Here are the possible coordinates");
		for(int i = 0; i <= x; i++)
			
			for (int j = 0; j <= y ; j++ )
				
				System.out.println("(" + i +"," +j+ ")");

	}

}
