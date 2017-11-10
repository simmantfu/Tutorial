import java.util.ArrayList;
import java.util.List;

public class SampleRaceCondition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i = 1, numofThr = 100; i <= 1000; i++) {
			Data data = new Data();
			List<Thread> thread = new ArrayList<Thread>();
			for (int k = 1; k <= numofThr; k++) {

				Thread ther = new Ther(data);
				ther.start();
				thread.add(ther);
			}

			for (Thread t : thread) {
				t.join();
			}

			if (data.getI() == 100) {
				System.out.println("System Passed");
			} else {
				System.out.println("System Fail: value of I is :" + data.getI());
			}
		}

	}

}

class Ther extends Thread {

	Data data;

	public Ther(Data data) {
		this.data = data;
	}

	public void run() {

        int i = data.getI();
		data.setValue(i + 1);
	}

}

class Data {
	private int i;

	public synchronized void setValue(int i) {

		this.i = i;

	}

	public synchronized int getI() {
		return this.i;
	}
}
