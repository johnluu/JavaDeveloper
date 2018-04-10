import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumbersTotal {


	public static void main(String[] args) throws IOException
	{	String path = System.getProperty("user.dir");
		Scanner Scan = new Scanner(System.in);
		
		printMenu();
		String userPath = "";
		int input = -1;
		while(userPath == "")
		{
			input = Scan.nextInt();
			Scan.nextLine();
			userPath = checkInput(input);
		}
		File readFrom = new File(path + "\\" + userPath);
		InputStreamReader stream = null;
		BufferedReader reader = null;
		int total = 0;
		try {
			stream = new FileReader(readFrom);
			reader = new BufferedReader(stream);
			String Line; 
			while((Line = reader.readLine()) != null)
			{
				String[] arr = Line.split(" ");
				for(String v: arr)
					{total+= Integer.parseInt(v);
					System.out.println(Integer.parseInt(v));
					}	
				System.out.println("The total is " + total);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

			stream.close();
			reader.close();

	}
	
	public static void printMenu() {
		
		System.out.println("Choose a file \r\n"
				+ "1: nums.txt \r\n"
				+ "2: nums2.txt \r\n"
				+ "3: nums3.txt \r\n"
				+ "4: nums4.txt \r\n");
	}
	
	public static String checkInput(int input) {
		
		switch (input){
		case 1 : 
			return "nums.txt";
		case 2 :
			return "nums2.txt";
		case 3 :
			return "nums3.txt";
		case 4 :
			return "nums4.txt";
		default :
			return "";
		}
		
	}
}