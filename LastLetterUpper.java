package lastletterupper;

public class LastLetterUpper {
	public static void main(String[] args) {
		String S="hello good morning";
		StringBuffer sb=new StringBuffer();
		String ar[]=S.split("");
		for(int i=0;i<ar.length;i++)
		{
			sb.append(ar[i].substring(0,ar[i]length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append("");
			}
		   System.out.println(sb.toString().trim());
	}

}
