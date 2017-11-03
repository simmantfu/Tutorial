import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args)
	  {
	    String txt="simmant";

	    String re1="(.)";	// Any Single Character 1
	    String re2="(.)";	// Any Single Character 2

	    Pattern p = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	    Matcher m = p.matcher(txt);
	    if (m.find())
	    {
	        String c1=m.group(1);
	        String c2=m.group(2);
	        System.out.print("("+c1.toString()+")"+"("+c2.toString()+")"+"\n");
	    }
	  }

}
