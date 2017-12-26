package interviewquestion;

import java.util.LinkedList;

public class Premutation {

	static void getPrem(String s) {

		int stringCount = fact(s.length());

		System.out.println(stringCount);
		
		String[] a = s.split("");
		String[] c = rev(s).split("");
		
		printCom(a, stringCount);
		
		printCom(c, stringCount);

	}

	static void printCom(String[] a, int stringCount) {
		LinkedList<String> st = new LinkedList<>();
		for (String a1 : a)
			st.add(a1);
		for (int i = 0; i <= (stringCount-2) / 2; i++) {
			System.out.println(st.toString());
			st.addLast(st.pop());
		}
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

		getPrem("siman");

	}

}
