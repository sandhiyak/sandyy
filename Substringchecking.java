import java.util.*;
public class Substringchecking{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		int x=0;
		for(int i=0;i<input1.length();i++)
		{
			for(int j=i+1;j<input1.length()+1;j++)
			{
				String s=new String();
				 s=input1.substring(i,j);
				if(input2.equals(s))
				{x++;
					System.out.println(i);
				}
			}
		}
		if(x==0)
			System.out.println("-1");
	}
}
