import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterToFile {


	public static void main(String[] args)
	{	String path = System.getProperty("user.dir");
		PrintWriter printStream = null;
		File WriteTo = new File(path + "\\letter.txt");
		try {
			printStream = new PrintWriter(new FileOutputStream(WriteTo,false));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String name = "Johnson Luu";
		String address1 = "121 Address way";
		String address2 = "Brooklyn, Ny 11111";
		printBorder(printStream);
		printSender(printStream);
		printEdge(printStream);
		formatAddress(printStream,name);
		formatAddress(printStream,address1);
		formatAddress(printStream,address2);
		
		printBorder(printStream);
		printStream.close();
	}
	
	public static void printBorder(PrintWriter p)
	{
		p.print("+");
	
		for(int i = 0 ; i < 31; i++)
		{
			p.print("-");
		}
		p.print("+");
		p.println();
		
	}
	public static void printSender(PrintWriter p) {
		
		for(int i = 0 ; i < 3; i++)
		{
		p.print("|");
		p.format("%31s", "####");
		p.print("|");
		p.println();
		}
		
	}
	
	public static void printEdge(PrintWriter p) {
		
		for(int i = 0 ; i < 3; i++)
		{
		p.print("|");
		p.format("%31s", "");
		p.print("|");
		p.println();
		}
		
	}
	
	public static void formatAddress(PrintWriter p,String s)
	{
		p.print("|");
		p.format("%28s", s);
		p.print("   |");
		p.println();
		
	}
}
