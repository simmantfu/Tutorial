
public class NotifyTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notione notione = new Notione();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				notione.getCount();
			}
		};

		Thread r = new Thread(runnable);
		r.start();

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				notione.incressCount();
			}
		};

		Thread r1 = new Thread(runnable1);
		r1.start();

	}

}

class Notione {

	int i = 0;

	public synchronized void incressCount() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.i = this.i + i;
		}
		System.out.println("counting done");
		this.notifyAll();

	}

	public synchronized void getCount() {
		System.out.println("Wait process going on");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" total count is :"+this.i);
	}

}