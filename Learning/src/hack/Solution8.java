package hack;
import java.util.Scanner;

public class Solution8 {

	static int count = -1;

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		String[] collect;
		if (k <= 100) {
			collect = new String[100 * 100];
		} else {
			collect = new String[k * k];
		}

		collect = subCheck(0, k, s, collect, 0);

		for (int i = 0; i < collect.length; i++) {
			for (int j = 0; j < collect.length; j++) {

				if (collect[i] != null && collect[j] != null) {

					String first = collect[i];
					String two = collect[j];

					int a = getCharIndex(first.toCharArray()[0]);
					int b = getCharIndex(two.toCharArray()[0]);

					if (a >= b) {
						String temp = collect[j];
						collect[j] = collect[i];
						collect[i] = temp;
					}
				}
			}

		}

		if ((collect[0] != null) && (collect[1] != null)) {
			smallest = collect[count-1];
			largest = collect[0];
		}
		return smallest + "\n" + largest;
	}

	public static String[] subCheck(int startPoint, int endpoint, String s, String[] collect, int index) {

		count++;
		if (endpoint < s.length()) {
			String subStr = s.substring(startPoint, endpoint);// System.out.println(subStr);
			collect[index] = subStr;
			index = index + 1;
			return subCheck(startPoint + 1, endpoint + 1, s, collect, index);
		} else {

			return collect;
		}
	}

	private static int getCharIndex(char c) {

		char[] chararray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < chararray.length; i++) {
			if (c == chararray[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getSmallestAndLargest(s, k));
	}
}
