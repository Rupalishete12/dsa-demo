import java.util.Arrays;

public class insertonsort {
	public static void main(String[] args)
	{
		
		int[] arr= {3,1,5,4,2};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void insertion(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=j+1;j>0;j--)
			{
			
			    if(arr[j]<arr[j-1])
			    {
				swap(arr,j,second:j-1);
				
			}else
 			{
				break;
			}
			}
		}
	}
	static void selection(int[] arr)
	{
	  for(int i=0;i<arr.length;i++)
	  {
		  int last=arr.length-i-1;
		  int maxindex=getMaxIndex(arr, start:0,last);
		  swap(arr,maxindex,last);
	  }
	  
	}
	static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[second]=temp;
	}
	private static int getMaxIndex(int[] arr,int start,int end)
	{
		int max=start;
		for(int i=start;i<=end;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}
	public class bubblesort {
		public static void main(String[] args)
		{
			int[] arr= {3,1,5,4,2};
			bubble(arr);
			System.out.println(Arrays.toString(arr));
		}
		static void bubble(int[] arr)
		{
			boolean swapped;
			//run the steps n-1 times
			for(int i=0;i<arr.length;i++)
			{
				swapped=false;
				for(int j=1;j<arr.length-1;j++)
				{
					//swap item
					if(arr[j]<arr[j-1])
					{
						
						int temp=arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=temp;
						swapped=true;
					}
				}
				if(!swapped)
				{
					break;
				}
			}
		}


	}
}

