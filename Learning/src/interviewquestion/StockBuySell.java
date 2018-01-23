package interviewquestion;
import java.util.Stack;

/*
 * Algorithm for this solution.
 * 1) Initialize Stack for integer value.
 * 2) Iterate array till end of its length.
 * 3) Add value in stack, if Iteration reach to last index of array.
 * 3) Check in every iteration that, if stk is not empty and if current index value is lesser and equal to peek value of stack,
 *    then Print first and peek value of stack, and after that clear the stack.
 * 4) Also if iteration come to last index of array then, Print first and peek value of stack, and after that clear the stack.
 * 5) Add current value in stack.    
 * */

public class StockBuySell {

	static void stockProcced(int[] a) {

		Stack<Integer> stk = new Stack<>();

		for (int i = 0; i <= a.length - 1; i++) {

			if (i == a.length - 1)
				stk.add(a[i]);

			if (!stk.isEmpty() && a[i] <= stk.peek() || (i == a.length - 1)) {
				System.out.println(" buy at :" + stk.firstElement() + " sell at " + stk.peek());
				stk.clear();
			}
			stk.add(a[i]);
		}

	}

	public static void main(String[] args) {

		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		stockProcced(price);

	}

}
