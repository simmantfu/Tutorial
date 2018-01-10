package interviewquestion;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Premutation2 {

	static void getPrem(String s) {
		
		int stringCount = fact(s.length());

		System.out.println(stringCount);
		
		String[] a = s.split("");
		String[] c = rev(s).split("");
		
		Set<String> set = printCom(a, stringCount);
		set.forEach(k->System.out.println(k));
		

	}

	static Set printCom(String[] a, int stringCount) {
		LinkedList<String> st = new LinkedList<>();
		Set<String> set = new TreeSet<>();
		for (String a1 : a)
			st.add(a1);
		for (int i = 0; i < stringCount/2; i++) {
			set.add(st.toString());
			st.addLast(st.pop());
		}
		
		return set;
	}

	static int fact(int k) {

		if (k == 0) {
			return 1;
		}

		return (k * fact(k - 1));
	}

	static String rev(String a) {
		String result = "";
		char[] ar = a.toCharArray();
		for (int j = ar.length - 1; j >= 0; j--) {
			result = result + ar[j] + "";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPrem("ABB");

	}

}
