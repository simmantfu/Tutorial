package hack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution19 {

	static int getHyt(int[][] a) {

		List<Integer> lis = new ArrayList<Integer>();

		int r1 = 0, r2 = 1, r3 = 2;

		for (int i = 0; i <=3; i++) {
			int c1 = 0, c2 = 1, c3 = 2;
			int[] a1 = new int[3];
			int[] a2 = new int[3];
			int[] a3 = new int[3];

			if (i >= 1) {
				r1 = r1 + 1;
				r2 = r2 + 1;
				r3 = r3 + 1;
			}

			for (int j = 0; j <= 3; j++) {
				if (j >= 1) {
					c1 = c1 + 1;
					c2 = c2 + 1;
					c3 = c3 + 1;
				}
				a1[0] = a[r1][c1];
				a1[1] = a[r1][c2];
				a1[2] = a[r1][c3];

				a2[0] = a[r2][c1];
				a2[1] = a[r2][c2];
				a2[2] = a[r2][c3];

				a3[0] = a[r3][c1];
				a3[1] = a[r3][c2];
				a3[2] = a[r3][c3];

				// System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
				// System.out.println(a2[0]+" "+a2[1]+" "+a2[2]);
				// System.out.println(a3[0]+" "+a3[1]+" "+a3[2]);

				int aA1 = a1[0] + a1[1] + a1[2];
				int aA2 =  a2[1];
				int aA3 = a3[0] + a3[1] + a3[2];

				lis.add(aA1 + aA2 + aA3);
			}

		}

		Collections.sort(lis, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub

				if (o2 == o1) {
					return 0;
				}

				if (o2 > o1) {
					return 1;
				} else {
					return -1;
				}

			}
		});

//		for (int res : lis) {
//			System.out.println(res);
//		}

		return lis.get(0);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int result = getHyt(arr);
		System.out.println(result);
	}

}
