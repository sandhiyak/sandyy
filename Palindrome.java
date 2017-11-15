import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 StringBuffer sb=new StringBuffer(s);
		 if(s.equals(sb.reverse().toString()))
    	 {
    		 System.out.println("The given string is a Palindrome.No need to remove any character");
    	 }
		 else
		 {
	         for(int i=0;i<sb.length();i++)
	         {
	        	 StringBuffer sb1=new StringBuffer(s);
	        	 StringBuffer del=sb1.deleteCharAt(i);
	        	 if((del.toString()).equals(del.reverse().toString()))
	        	 {
	        		 System.out.println("Remove the character at index "+i+" to become Palindrome");
	        	 }
        		
        	 }
         }
	}
}
