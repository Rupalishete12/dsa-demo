
public class sortedmatrix {
	public static void main(String[] args)
	{
		
	}
	static int[] binarysearch(int[] matrix,int row,int cstart,int cend,int target) {
		while(cstart<=cend) {
			int mid=cstart+(cend-cstart)/2;
			if(matrix[row][mid]==target)
			{
				return new int[] {row,mid};
			}
			if(matrix[row][mid]<target)
			{
				cstart=mid+1;
				
			}else
			{
				cend=mid-1;
			}
			
		}
		return new int[] {-1,-1};
	}
	static int[] search(int[] matrix,int target)
	{
		int rows=matrix.length;
	int cols=matrix[0].length;
	if(rows==1)
	{
		return binarysearch(matrix,row:0,cstart:0,cend:col-1,target);
		
	}
	int rstart=0;
	int rend=rows-1;
	int cmid=cols/2;
	//run the loop till 2 rows remaining
	while(rstart<(rend-1))
	{
		int mid=rstart+(rend-rstart)/2;
		if(marix[mid][cmid]==target)
		{
			return new int[] {mid,cmid};
		}
		if(matrix[mid][cmid]<target)
		{
			rstart=mid;
		}
		else
		{
			rend=mid;
		}
	}
	//now yo have 2rows
	//check whether taret is in column of two rows
	if(matrix[rstart])[cmid]==target)
{

	return new int[] {rstart,cmid};
}
if(matrix[rstart][cmid]==target)
{
	return new int[] {rstart+1,cmid};
}
//search in first half
//2nd
//3rd
//4th

	}

}
