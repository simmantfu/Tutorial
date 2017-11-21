package hack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution12 {

	static List<String> str = new ArrayList<String>();

	public static void main(String... strings) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>=1 && n<=Math.pow(10, 5))
		 for (int a0 = 0; a0 < n; a0++) {
		 String name = in.next();
		 int value = in.nextInt();
		 str.add(name + "+" + value);
		 }
		
		 printStatement(str);

		in.close();
	}

	private static void printStatement(final List<String> str) {

		List<LapCls> str2 = new ArrayList<LapCls>();
		String rej = "^*[a-zA-Z]$";

		for (String s : str) {

			String[] sAray = s.split("\\+");
			if (sAray[1].contains("4") || sAray[1].contains("7")) {

				String[] sA = sAray[1].split("");
//				int i = 0;
//				for (int j = 1; j < sA.length; j++) {
//					i = i + Integer.parseInt(sA[j]);
//				}

				int s4 = 0, s7 = 0;
				s4 = check4S(sA);
				s7 = check7S(sA);
				LapCls cls = new LapCls(sAray[0], Integer.parseInt(sAray[1]), s4, s7);
				str2.add(cls);
			}
		}

		Collections.sort(str2, new Comparator<LapCls>() {

			@Override
			public int compare(LapCls o1, LapCls o2) {
				// TODO Auto-generated method stub

				if (o1.bPrice == o2.bPrice) {
					return 0;
				}

				if (o1.bPrice > o2.bPrice) {
					return 1;
				} else {
					return -1;
				}
			}
		});

		if ((str2.size() > 0) && ((str2.get(0).bName.length() >= 1) && (str2.get(0).bName.length() <= 10))
				&& str2.get(0).bName.matches("[a-zA-Z]+") && (str2.get(0).s4 == str2.get(0).s7)
				&& (str2.get(0).bPrice >= 1 && str2.get(0).bPrice <= Math.pow(10, 9))) {

			System.out.println(str2.get(0).bName);
		} else {
			System.out.println(-1);
		}

	}

	static int check4S(String[] a) {
		int k = 0;
		for (String c : a) {
			if (c.equals("4"))
				k++;
		}
		return k;
	}

	static int check7S(String[] a) {
		int k = 0;
		for (String c : a) {
			if (c.equals("7"))
				k++;
		}
		return k;
	}

	static class LapCls {
		String bName = null;
		int bPrice = 0;
		int s4 = 0;
		int s7 = 0;

		public LapCls(String bName, int bPrice, int s4, int s7) {
			this.bName = bName;
			this.bPrice = bPrice;
			this.s4 = s4;
			this.s7 = s7;
		}

	}

}
