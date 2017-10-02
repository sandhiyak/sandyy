import java.util.*;
public class Subsetarray{
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		String s2[]=sc.nextLine().split(" ");
		int c=0;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i].equals(s2[j]))
				c++;	
			}
		}
		if(c==s2.length)
		{
			System.out.print("true");
		}
		else
			System.out.println("False");
	}
}
