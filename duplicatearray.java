//find all duplicate array

import java.util.Arrays;
import java.util.List;

public class duplicatearray {
	//public static void main(String[] args)
	//{
	//	int[] arr= {4,0,2,1};
	//	System.out.println(findduplicates(arr));
	//}
	public List<Integer> findduplicates(int[] arr)
	{
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i] !=arr[correct])
			{
				swap(arr,i,correct);
				
			}
			else
			{
				i++;
			}
		}
		List<Integer> ans=new ArrayList<>();
		for(int index =0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{
				ans.add(arr[index+1]);
			}
		}
		return ans;
	}
	}
	static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
