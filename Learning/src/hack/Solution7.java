package hack;
import java.util.Scanner;

public class Solution7 {

	public static void main(String... strings) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		if ((S.length() >= 1 && S.length() <= 100) && (start >= 0 && end <= S.length())) {
            String finalStr = S.substring(start, end);
			System.out.println(finalStr);
		}
	}

}
