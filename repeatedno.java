import java.util.*;
public class repeatedno{
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-1;j++)
			{
			if(s[i].equals(s[j+1]))
			{
				System.out.print(s[i]);
				System.exit(0);
			}
			}
		}
	}
}
