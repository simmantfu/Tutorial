package hack;
import java.util.Scanner;

public class Solution6 {

	
	
   public static void main(String...strings){
	   Scanner sc=new Scanner(System.in);
       String A=sc.next();
       String B=sc.next();
       
       int a = getCharIndex(A.toCharArray()[0]);
       int b = getCharIndex(B.toCharArray()[0]);
       
       System.out.println(A.length()+B.length());
       String finalstring = a>b?"Yes":"No";
       System.out.println(finalstring);
       
       A  = changeCase(A);
       B  = changeCase(B);
       
       
       System.out.println(A+" "+B);
	}
	
   private static int getCharIndex(char c){
	   
	   char[] chararray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	   
	   for(int i = 0;i<chararray.length;i++){
		   if(c == chararray[i]){
			   return i;
		   }
	   }
	   return -1;
   }
  
   private static String changeCase(String s){
	 
	   char[] a = s.toCharArray();
	   
	   String finalStirng = "";
	   
	   for(int i = 0;i<a.length;i++){
		   if( i == 0){
			   String t = a[0]+"";
			   finalStirng = t.toUpperCase();
		   }else{
			   finalStirng = finalStirng+a[i];
		   }
		   
		  
	   }
	   return finalStirng;
   }
   
}
