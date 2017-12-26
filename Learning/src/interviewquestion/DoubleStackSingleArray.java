package interviewquestion;

import interviewquestion.Double.St1;
import interviewquestion.Double.St2;

public class DoubleStackSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double double1 = new Double();

		St1 st1 = new St1();
		St2 st2 = new St2();

		for (int i = 0; i <= 4; i++) {
			st1.push(i);
		}
		for (int i = 5; i <= 9; i++) {
			st2.push(i);
		}

		for (int i : double1.n) {
			System.out.println(i);
		}

	}

}

class Double {

	static int[] n;
	static final int defaultCapacit = 10;

	public Double() {
		// TODO Auto-generated constructor stub
		n = new int[defaultCapacit];
	}

	public Double(int size) {
		// TODO Auto-generated constructor stub
		n = new int[size];
	}

	static public class St1 {

		int intSize = -1;

		public void push(int data) {
			intSize++;
			if (intSize < (n.length / 2)) {
				n[intSize] = data;
			}
		}

		public void pop() {
			if (intSize >= 0) {
				n[intSize] = (Integer) null;
			}
			intSize--;
		}
	}

	static public class St2 {

		int intSize = (n.length / 2)-1;

		public void push(int data) {
			intSize++;
			if (intSize < (n.length)) {
				n[intSize] = data;
			}
		}

		public void pop() {
			if (intSize >= (n.length / 2)-1) {
				n[intSize] = (Integer) null;
			}
			intSize--;
		}
	}
}