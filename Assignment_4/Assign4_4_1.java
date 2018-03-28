public class Assign4_4_1 {

	public static void main(String[] args)
	{
		
		int[][] newstuff = new int[3][3];
		int max = 0;
		
		for(int i = 0; i < newstuff.length; i++)
			for(int j = 0; j < newstuff[i].length; j++)
			{
				newstuff[i][j] = (int) (Math.random()*100 + 1);
				if(newstuff[i][j] > max)
					max = newstuff[i][j];
					
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
		
		System.out.println("The max is " + max);
	}
}