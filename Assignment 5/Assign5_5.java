import java.util.Scanner;
public class Assign5_5 {

	public static void main(String[] args) {
		
		for(int i = 10; i <= 20; i+= 2)
		{		
			if( i == 16) {
				continue;
			}
			System.out.print(i + " ");
		}		
			System.out.println();
//////////////////////////////////////////////		
		for(int i = 10; i <= 20; i++)
		{		
			if( i == 16) {
				continue;
			}
			
			if( i %2 ==  0) {				
				System.out.print(i + " ");
				continue;
			}			
		}			
		System.out.println();
//////////////////////////////////////////////
		
		int x = 10;
		while(true)
		{
			
			if(x > 20)
				break;
			
			if( x == 16) {
				x += 2;			
				continue;
			}
			
			
			
			if( x %2 ==  0) {				
				System.out.print(x + " ");
				x += 2;
				continue;
				
			}
			
		}
//////////////////////////////////////////////			
			
		
		
	}

}
