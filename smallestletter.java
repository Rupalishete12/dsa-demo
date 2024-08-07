
public class smallestletter {
	public static void main(String[] args)
	{
	/*	char[] arr= {'c','f','g'};
		char target='j';
		char ans=nextgreatestletter(letters,target);
		System.out.println(ans);*/                                                                     
		
	}
	public char nextgreatestletter(char[] letters,char target)
	{
		int start=0;
		int end=letters.length-1;
		while(start<=end)
		{
			int mid=start +(end-start)/2;
			if(target<letters[mid]) {
				end=mid-1;
				
			}
			else if(target >letters[mid])
			{
				start=mid-1;
				
			}
			else {
				return end;
			}
		}
		return letters[start%letters.length];
	}

}
