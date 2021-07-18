package mostfrequentnumber;

public class MostFrequentNumberArray {
	
	static int mostFrequent(int arr[],int n)
	{
		int max_count=1,res=arr[0];
		int curr_count=1;
		for (int i=1;i<n;i++)
		{
			if (arr[i]==arr[i-1])
				curr_count++;
			else
			{
				if(curr_count>max_count)
				{
					max_count=curr_count;
				}
				curr_count = 1;
			}
		}
		
		if(curr_count > max_count)
		{
			
			max_count = curr_count;
			res = arr[n-1];
		}
		
		return res;
	}
		public static void main (String[] args) {
			
			int arr[]= {1, 5, 4, 3, 1, 2, 5, 3, 3};
			int n=arr.length;
			System.out.println(mostFrequent(arr,n));
			
		
		}
		
}
			

	

