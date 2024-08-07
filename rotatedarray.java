//search in rotated sorted array
public class rotatedarray {
	public static void main(String[] args)
	{
		int[] arr= {4,5,6,7,8,0,1,2};
		System.out.println(findpivot(arr));
		
	}
	static int search(int[] nums,int target) {
		int pivot=findpivot(nums);
		if(pivot==-1)
		{
			return binarysearch(nums,target,start:0,end:0,end:nums.length-1);
		}
		if(nums[pivot]==target) {
			return pivot;
		}
		
	}
	static int binarysrch(int[] arr,int target,int start,int end)
	{
		//int start=0;
		//int end=arr.length-1;
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

	int findpivot(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start +(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid< end && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(mid>=start && arr[mid]< arr[mid-1])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
				}
	}

}

