
public class pattern2 {
	public static void main(String[] args)
	{
         pattern(n=4);
	}
	static void pattern1(int n) {
		

		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
				
			}
			//when one row is printed we need to add new line
			System.out.println();
		}
	}
	static void pattern2(int n) {
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
				
			}
			//when one row is printed we need to add new line
			System.out.println();
		}
}
