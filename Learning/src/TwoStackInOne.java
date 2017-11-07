
public class TwoStackInOne {

	private static int INIT_CAPACITY = 10;
	Object[] objectsArray;
	static int range1 = 0;
	static int range2 = 0;

	TwoStackInOne() {
		init(INIT_CAPACITY);
	}

	TwoStackInOne(int capacity) {
		init(capacity);
	}

	private void init(int b) {
		objectsArray = new Object[b];
		this.INIT_CAPACITY = b;
		range1 = INIT_CAPACITY / 2;
		range2 = this.INIT_CAPACITY;
	}

	private int top = -1;
	class StackOne {
		

		public void push(Object data) {
			if (top < range1) {
				top++;
				objectsArray[top] = data;
			} else {
				System.out.println("StackOverFlow");
			}
		}

		public void pop() {
			if (top >= 0) {
				top--;
				objectsArray[top] = null;
			} else {
				System.out.println("StackOverFlow");
			}
		}

		public void printOne() {
			for (int i = 0; i <= range1 - 1; i++) {

				if (objectsArray[i] != null) {
					System.out.println(objectsArray[i]);
				}

			}

		}
		
	}

	private int topSec =  INIT_CAPACITY / 2;
	
	class StackTwo {
		

		public void push(Object data) {
			if (topSec < range2) {
				objectsArray[topSec] = data;
				topSec++;
			} else {
				System.out.println("StackOverFlow");
			}
		}

		public void pop() {
			if (topSec >= range1) {
				topSec--;
				objectsArray[topSec] = null;
			} else {
				System.out.println("StackOverFlow");
			}
		}

		public void printTwo() {
			for (int i = range1; i <= range2 - 1; i++) {

				if (objectsArray[i] != null) {
					System.out.println(objectsArray[i]);
				}

			}

		}
		
	}
	
	public StackOne getOne(){
		return new StackOne();
	}
	
	public StackTwo getTwo(){
		return new StackTwo();
	}
	
	public static void main(String...strings){
		TwoStackInOne twoStackInOne = new TwoStackInOne(10);
		twoStackInOne.getOne().push(1);
		twoStackInOne.getOne().push(2);
		twoStackInOne.getOne().push(3);
		twoStackInOne.getOne().push(4);
		twoStackInOne.getOne().push(5);
		twoStackInOne.getOne().printOne();
		
		twoStackInOne.getTwo().push(6);
		twoStackInOne.getTwo().push(7);
		twoStackInOne.getTwo().push(8);
		twoStackInOne.getTwo().push(9);
		twoStackInOne.getTwo().push(10);
		twoStackInOne.getTwo().printTwo();
		
	}
	
}
