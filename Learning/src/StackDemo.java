
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
			if (object != null)
				System.out.println((int) object);
		}

	}

	public int min() {

		int result = 0;

		for (int i = 0; i <= objects.length - 1; i++) {
			for (int j = 0; j <= objects.length - 1; j++) {
				if ((objects[i] != null) && objects[j] != null) {
					int x = (int) objects[i];
					int y = (int) objects[j];
					if (x < j) {
						result = x;
					}
				}
			}
		}

		return result;
	}

	public static void main(String... ar) {
		StackDemo demo = new StackDemo(10);

		for (int i = 10; i > 0; i--) {
			demo.push(i);
		}

		//demo.print();
		System.out.println(demo.min());
	}

}
