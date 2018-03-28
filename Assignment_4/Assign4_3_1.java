
public class Assign4_3_1 {

	public static void main(String[] args)
	{
		
		int[] newstuff = new int[10];
		
		
		for(int i = 0; i < newstuff.length; i++)
			
		
			newstuff[i] = (int) (Math.random()*100 + 1);
		
		
		int[] copy = newstuff;
		
		
		for(int i = 0; i < newstuff.length; i++)
		{
			
			System.out.println("New Stuff " + newstuff[i]);
			System.out.println();
			
		}
		
		
	}
}
