import java.util.*;
public class NumberofLettters {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.next()+"x";
		for(int i=0;i<s.length()-1;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				if(Character.isDigit(s.charAt(i+1)))
				{
					String str=s.substring(i,i+2);
					int n=Integer.parseInt(str);
					for(int j=0;j<n;j++)
					{
						System.out.print(s.charAt(i-1));
					}
				}
				else if(Character.isDigit(s.charAt(i-1)))
				{
					
				}
				else
				{
					int n=Character.getNumericValue(s.charAt(i));
					for(int j=0;j<n;j++)
					{
						System.out.print(s.charAt(i-1));
					}
				}
			}
		}
	}
}
