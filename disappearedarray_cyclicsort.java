//find all numbers disappeared array

import java.util.List;
import java.util.Arrays;

public class disappearedarray_cyclicsort {
	public static void main(String[] args)
	{
		int[] arr= {4,3,2,7,8,2,3,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public List<Integer> finddisappearedno(int[] nums)
	{
		int i=0;
		while(i<nums.length) {
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct])
			{
				swap(nums,i,correct);
				
			}
			else
			{
				i++;
			}
		}
		List<Integer> ans=new ArrayList<>();
		for(int index =0;index<nums.length;index++)
		{
			if(nums[index]!=index+1)
			{
				ans.add(index+1);
			}
		}
		return ans;
	}
	static void sort(int[] nums)
	{
		int i=0;
		while(i<nums.length) {
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct])
			{
				swap(nums,i,correct);
				
			}
			else
			{
				i++;
			}
		}
	}
	static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
