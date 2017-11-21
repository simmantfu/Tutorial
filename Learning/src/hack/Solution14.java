package hack;
import java.util.Scanner;

public class Solution14 {

	static int H1, W1;

	static int surfaceArea(int[][] A) {
		// Complete this function

		int area = 0;

		for (int A_i = 0; A_i < H1; A_i++) {
			
			for (int A_j = 0; A_j < W1; A_j++) {
				int result = 6 * (A[A_i][A_j]*A[A_i][A_j]);
				System.out.println(result+6);
			}

		}
		return area+6;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		H1 = H;
		W1 = W;
		int[][] A = new int[H][W];
		for (int A_i = 0; A_i < H; A_i++) {
			for (int A_j = 0; A_j < W; A_j++) {
				A[A_i][A_j] = in.nextInt();
			}
		}
		int result = surfaceArea(A);
		//System.out.format("%.2f", result);
		in.close();

	}

}
