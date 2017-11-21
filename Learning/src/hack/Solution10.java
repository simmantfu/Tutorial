package hack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution10{

    public Pattern pattern;
   

    private static final String IPADDRESS_PATTERN =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public Solution10(){
	  pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

   
  
}