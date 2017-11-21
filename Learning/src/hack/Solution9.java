package hack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution9 {

	public static void main(String...strings){

		List<String> str = new ArrayList<String>();
		
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	    	  
	         String pattern = in.nextLine();
	         str.add(pattern);
	         testCases--;
	      }
	      
	      for(String a:str){
	    	  try {
		             Pattern.compile(a);
		             System.out.println("Valid");
		         } catch (PatternSyntaxException exception) {
		        	 System.out.println("Invalid");
		             
		         }
	      }
	      
	}
	
}
