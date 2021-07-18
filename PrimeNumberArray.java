package primenumber;

public class PrimeNumberArray {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		for(int i=0;i<=arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(arr[i]+" it is a prime number:");
				count=0;
			}
			else
			{
				System.out.println(arr[i]+"its not prime");
			}
		}
	}

}
