import java.util.*;
public class Encodedcodekata{
       public static void main(String[] args) {
	         Scanner sc=new Scanner(System.in);
	         char ch1[]=sc.next().toCharArray();
	         char ch2[]=sc.next().toCharArray();
	         for(int i=0;i<ch1.length;i++)
	         {
	        	 if(ch1[i]>='a' && ch1[i]<='p')
	        	 {
	        	 char c1=(char)(ch1[i]+10);
	        	 System.out.print(c1);
	        	 c1=0;
	        	 }
	        	 else
	        	 {
	        		 int x=(int)ch1[i]+10-26;
	        			System.out.print((char)(x));
	        	 }
	         }
	         System.out.print(" ");
	         for(int j=0;j<ch2.length;j++)
	         {
	        	 if((j==0)||(j==ch2.length-1))
	        		 System.out.print(ch2[j]);
	        	 else
	        	 {
					if(ch2[j]>='a' && ch2[j]<='p')
	        		 {
	        		 char c2=(char)(ch2[j]+10);
	        		 System.out.print(c2);
	        		 c2=0;
	        		 }
	        		 else
	        		 {
	        			int x=(int)ch2[j]+10-26;
	        			System.out.print((char)(x));
	        		 }
	        	 }
	         }    
	}
}


