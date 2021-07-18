package stringvowelsinorder;

public class VowelsInOrder {
	
	static boolean areVowelsInOrder(String s)
	{
		int n=s.length();
		char c=(char) 64;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				if(s.charAt(i)<c)
					return false;
				else;
				
				c=s.charAt(i);
			}
		}
				
	    return true;
}

public static void main(String[]args)
{
	String s="abbddeccc";
	if(areVowelsInOrder(s))
		System.out.print("yes");
	else
		System.out.print("no");
}
}