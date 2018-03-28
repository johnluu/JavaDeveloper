import java.util.Scanner;

public class Assign4_4_4 {

	public static void main(String[] args)
	{
		
		char[][] position = new char[5][5];
		
		String direction = "";
		int x = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		boolean error = false;

		
		while(!error)
		{
			
		System.out.println("Current Map \n==========");
		position[x][y] = 'X';
		for(int i = 0; i < position.length; i++)
		{
			for(int j = 0; j < position[i].length ; j++)
			{
			
				if(x == i && y == j)
					position[i][j] = 'X';
				else
					position[i][j] = 'O';
				
			System.out.print(position[i][j] + " ");
			
			}
			System.out.println();
		}
			
			
			System.out.println("==========\nChoose a Direction ");
			direction = scan.nextLine();
			
		
			switch(direction)
			{
			case "down":
				if(x+ 1 > position.length-1)
				{
				error = true;
				}
				x++;
				break;
			case "up":
				if(x- 1 < 0)
				{
				error = true;
				}
				x--;
				break;
			case "right":
				if(y+ 1 > position[0].length-1)
				{
				error = true;
				}
				y++;
				break;
			case "left":
				if(y - 1 < 0)
				{
				error = true;
				}
				y--;
				break;
			default:
				System.out.println("Enter a valid input");
			}
		}
		System.out.println("You left map exiting program ");
	}
}