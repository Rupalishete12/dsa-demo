
public class bitonicarray {
	public static void main(String[] args)
	{
	}
	
		int search(int[] arr,int target) {
			int peak=peakindex(arr);
			int firsttry=binarysrch(arr,target,start:0,peak);
			if(firsttry!=-1) {
				return firsttry;
			}
			return orderanostic(arr,target,start:peak+1,end:arr.length-1);
		}
	
	public int peakindex(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				//you are in descending part
			{
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		//pointing to the largest number because of 2checks
		return start;//reurn end also both are same
		
	}
	static int orderanostic(int[] arr,int target,int start,int end)
	{
		//int start=0;
		//int end=arr.length-1;
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
