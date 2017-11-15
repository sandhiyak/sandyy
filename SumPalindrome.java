import java.util.*;
public class SumPalindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int rem=0,sum=0;
         while(n>0)
         {
        	 rem=n%10;
        	 sum=sum+rem;
        	 n=n/10;
         }
         String s=String.valueOf(sum);
         StringBuffer sb=new StringBuffer(s);
         if(s.equals(sb.reverse().toString()))
         System.out.println("Palindrome");
         else
        	 System.out.println("Not a Palindrome");
	}
}
