
public class binarysearch {
	public static void main(String[] args)
	{
		int[] arr= {-18,-13,-4,0,3,4,2,4,69};
		int target=2;
		int ans=binarysrch(arr,target);
		System.out.println(ans);
		
	}
	static int binarysrch(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start +(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
				
			}
			else if(target >arr[mid])
			{
				start=mid+1;
				
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
