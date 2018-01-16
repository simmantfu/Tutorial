package interviewquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class StringPattern {

	public static void main(String[] args) {
		
		int[] a = { 146, 444,123};
		List<Integer> sList = new ArrayList<>();
		StringJoiner joiner = new StringJoiner(",");
		String result = "-1";
		for (int b : a) {
			String s = new String(b + "");

			if (s.contains("1") && s.contains("2") && s.contains("3")) {
				sList.add(b);
			}

		}

		Collections.sort(sList);

		for (int i : sList) {
			joiner.add(i + "");
		}

		
		
		if(sList.size()>0) {
			result = joiner.toString();
		}
		
		System.out.println(result);
		
 
	}

}
