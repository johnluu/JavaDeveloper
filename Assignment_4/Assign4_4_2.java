import java.util.Scanner;

public class Assign4_4_2 {

	public static void main(String[] args)
	{
		
		
		Scanner scan = new Scanner(System.in);
		int[][] newstuff = new int[3][3];

		
		for(int i = 0; i < newstuff.length; i++)
			for(int j = 0; j < newstuff[i].length; j++)
			{
				newstuff[i][j] = (int) (Math.random()*10 + 1);

					
					
			}
		
		
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Arr["+i+"] ");
			for(int j = 0; j < 3 ; j++)
			{
			
			
			System.out.print(newstuff[i][j] + " ");
			
			}
			System.out.println();
		}
		
		
		int input = newstuff.length + 1;
		int sum = 0;
		
		while(input > 2)
		{
			System.out.println("Please select an array");
			input = scan.nextInt();
		}
		for(int i = 0; i < newstuff[0].length;i++)
		
			sum +=  newstuff[input][i];
			
		
		System.out.println("The sum of that array is " + sum);
	}
}