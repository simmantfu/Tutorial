package interviewquestion;

public class ArmstrongValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 999; i++) {
			int result = 0;

			int[] ar = getSum(i + "");

			for (int k : ar) {
				result = result + k;
			}

			if ((i + "").equals(result + "")) {
				System.out.println(result);
			}

		}
	}

	static int[] getSum(String data) {

		int[] data1 = null;
		String[] s = data.split("");
		data1 = new int[s.length];

		for (int i = 0; i < s.length; i++) {
			data1[i] = Integer.parseInt(s[i]);
		}

		for (int i = 0; i < data1.length; i++) {
			data1[i] = data1[i] * data1[i] * data1[i];
		}

		return data1;
	}

}
