
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Parse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello=world;JSESSIONID=sdsfsf;Path=/ei";
		
		List<String> sarray = Arrays.asList(s.split(";"));
		
		String filterStr = sarray.get(sarray.indexOf("JSESSIONID=sdsfsf"));
System.out.println(filterStr.replace("JSESSIONID=", ""));
	}

}
