package com.stack;

public class AppleBucket {

	static int getMinApple(int[] a) {

		int result = 0;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (i != a.length - 1) {
				if (a[i] < a[i + 1]) {

					int b = a[i];
					int c = a[i + 1];
					while (b != c) {
						b = b + 1;
						c = c - 1;
						count++;
					}
				}
				result = count;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = { 1, 3, 6 };

		int k = getMinApple(b);

		System.out.println("" + k);

	}

}
