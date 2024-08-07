
public class searchinrange {
	public static void main(String[] args) {
	int[] arr= {18,12,-7,3,14,28};
	int target=14;
	System.out.println(linearsearch1(arr,target, start:1, end:4));
	}
		
	
	static int linearsearch1(int[] arr,int target,int start,int end) {
		
		if(arr.length==0)
		{
			return -1;
		}
				
		for(int index=start;index<=end;index++)
		{
			//check elem at every target
			int element =arr[index];
			if(element==target)
			{
				return index;
			}
		}
		return -1;
}
}
