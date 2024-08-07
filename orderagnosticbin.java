
public class orderagnosticbin {
	public static void main(String[] args)
	{
		int[] arr= {-18,-13,-4,0,3,4,2,4,69};
		int target=0;
		int ans=orderanostic(arr,target);
		System.out.println(ans);
	}
	static int orderanostic(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		{
			int mid=start +(end-start)/2;
			if(arr[mid]==target)
			{
				end=mid-1;
			}
			
			else if(target >arr[mid])
			{
				start=mid+1;
				
			}
			else {
				if(target>arr[mid])
				{
					end=mid-1;
					
				}
				else
				{
					start=mid+1;
				}
			}
		}
		return -1;
	}

}



