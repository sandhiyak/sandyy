import java.util.*;
public class Doublestrings{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int x=0;
		for(int i=0;i<s.length()-1;i++)
		{
			String f=s.substring(0,i+1);
			for(int j=i;j<s.length();j++)
			{
				String l=s.substring(j,s.length());
				if(f.equals(l))
				{   x++;
					System.out.println("DoubleStrings");
					break;
				}
			}
		}
		if(x==0)
			System.out.println("Not Double Strings");
	}
}
