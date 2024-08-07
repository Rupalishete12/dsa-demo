//find peaak in mountan array

public class mountainarray {
	public static void main(String[] args)
	{
		
		
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
}