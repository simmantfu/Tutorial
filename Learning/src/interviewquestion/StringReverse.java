package interviewquestion;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "testname";
		s = rev(s);
		System.out.println(s);
	}

	static String rev(String sr) {

		char[] cArray = sr.toCharArray();

		String finlStr = "";

		for (int i = cArray.length - 1; i >= 0; i--) {

			finlStr = finlStr + cArray[i] + "";
		}
		return finlStr;
	}

}
