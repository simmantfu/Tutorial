
public class StackDemo {

	private static int capacity = 8;
	private int top = -1;
	Object[] objects;

	public StackDemo(final int capacity) {
		this.capacity = capacity;
		objects = new Object[this.capacity];
	}

	public void push(int i) {
		if (top < capacity - 1) {
			top++;
			objects[top] = i;
		} else {
			System.out.println("stack over flow");
		}
	}

	public void pop() {
		if (top >= 0) {
			top--;
			objects[top] = null;
		}

	}

	public void print() {

		for (Object object : objects) {
			System.out.println((int) object);
		}

	}

	public static void main(String... ar) {
		StackDemo demo = new StackDemo(10);

		for (int i = 0; i < 10; i++) {
			demo.push(i);
		}

		demo.print();
		demo.pop();
		demo.print();
	}

}
