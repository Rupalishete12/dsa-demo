
public class pattern3 {
	public static void main(String[] args)
	{
		pattern3(n:4);

	}

static void pattern3(int n) {
		

		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row+1;col++)
			{
				System.out.print("*");
				
			}
			//when one row is printed we need to add new line
			System.out.println();
		}pp
	}
	static void pattern2(int n) {
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("*");
				
			}
			//when one row is printed we need to add new line
			System.out.println();
		}
}
}