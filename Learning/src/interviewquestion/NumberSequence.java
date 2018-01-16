package interviewquestion;

import java.util.Objects;
import java.util.Stack;

public class NumberSequence {
	static int sum(String s) {

		String finalResultStr = "";

		int finalResult = -1;
		
		char[] sqArray = s.toCharArray();

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i <= s.length(); i++) {

			stack.push(i + 1);

			if (i == sqArray.length || sqArray[i] == 'N') {

				while (!stack.empty()) {

					finalResultStr += stack.peek() + "";

					stack.pop();
				}
			}
		}

		if((s.contains("M")||s.contains("N")) && !s.contains(" ") && Objects.nonNull(s)){
		finalResult = 	Integer.parseInt(finalResultStr);
		}
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.max(5, 4));

	}

}
