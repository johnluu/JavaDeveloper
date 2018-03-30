import java.util.Scanner;

public class Assign4_4_3 {
	
	
	public static char checkWin(char position[][]) {
		
		for(int i = 0; i < position.length; i++)
		{
			if((position[i][0] == position[i][1] && position[i][1] == position[i][2]) && (position[i][0]!= '#'))
				return position[i][0];
			
			if((position[0][i] == position[1][i] && position[1][i] == position[2][i]) && (position[0][i]!= '#'))
				return position[i][0];
		
		}
		
		if(((position[0][0] == position[1][1] && position[1][1] == position[2][2])
				|| (position[2][0] == position[1][1] && position[1][1] == position[0][2])) &&	(position[1][1]!= '#'))
			return position[1][1];
	
		
		
		
		return '#';
		
	}

	public static void main(String[] args)
	{
		
		char[][] position = new char[3][3];
		int turn = 0;
		int x = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < position.length; i++)
			for(int j = 0; j < position[i].length; j++)
			{
				position[i][j] = '#';
					
			}
		
		while(turn < 9)
		{
			if (checkWin(position) == 'x')
			{	System.out.println("X wins");
				break;
			}
			else if (checkWin(position) == 'y')
			{	System.out.println("y wins");
				break;
			}
				
					
					
			
			
			System.out.print("Choose a position ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(x > 2 || y > 2)
			{
				System.out.println("Please enter a number 2 or less");	
				continue;
				
			}
			
			if(position[x][y] == 'x' || position[x][y]=='y')
			{
				System.out.println("Please enter another position");	
				
			}
			
			
			else
			{
			if(turn % 2 == 1)
			position[x][y] = 'x';
			else
			position[x][y] = 'y';
		
			turn++;
			}
			System.out.println("Current Board \nTurn number " + turn);
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3 ; j++)
			{
			
			
			System.out.print(position[i][j] + " ");
			
			}
			System.out.println();
		}
		
		}
		System.out.println("Good Game");
		scan.close();
	}
}