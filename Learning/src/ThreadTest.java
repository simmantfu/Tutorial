
public class ThreadTest {

	public static synchronized void suncMessage() {
		System.out.print("1");
	}

	public static synchronized void suncMessage2() {
		//asuncMessage();
		System.out.print("2");
	}

	public static synchronized void suncMessage3(String s) {
		System.out.print("3m" + s);
	}

	public static void main(String... at) throws InterruptedException {
		Thread t1 = new Thread() {

			public void run() {
				for (int i = 0; i <= 2; i++) {
					suncMessage();
				}
			}

		};

		Thread t2 = new Thread() {

			public void run() {
				for (int i = 0; i <= 2; i++) {
					suncMessage2();
				}
			}

		};
		
		
		Thread t3 = new Thread() {

			public void run() {
				for (int i = 0; i <= 2; i++) {
					suncMessage3("3");
				}
			}

		};
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

	
	
	
}
