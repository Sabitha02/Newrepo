package removeduplicates;

public class RemoveDuplicatesArray {

	public static int removeDuplicateElements(int arr[],int n)
	{
		if(n==0 || n==1) {
			return n;
		}
		int[]temp=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[i+1]){
				temp[j++]=arr[n-1];
			}
				for (int i1=0;i1<j;i1++) {
					arr[i1]=temp[i1];
			}
				return j;
				
			}
			
			public static void main (String[] args) {
				int arr1[]= {10,10,30,40,50,50,60};
				int length=arr1.length;
				length=removeDuplicateElements(arr1,length);
				for(int i=0;i<length;i++)
					System.out.print(arr1[i]+" ");
			}
		}
	}
