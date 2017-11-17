import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class CountDownLetchTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final CountDownLatch countDownLatch = new CountDownLatch(2);

		Thread thread = new Thread(new CunTut(countDownLatch, "1st", 1000));
		Thread thread2 = new Thread(new CunTut(countDownLatch, "2nd", 1000));
		Thread thread3 = new Thread(new CunTut(countDownLatch, "3rd", 1000));
		Thread thread4 = new Thread(new CunTut2());
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	

		try {
			countDownLatch.await();
			System.out.println("All service is up");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
}

class CunTut implements Runnable {

	CountDownLatch cunLen = null;
	String serViceName = null;
	int delay = 0;

	public CunTut(CountDownLatch cunLen, String serViceName, int delay) {
		// TODO Auto-generated constructor stub
		this.cunLen = cunLen;
		this.serViceName = serViceName;
		this.delay = delay;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("service " + this.serViceName + " up ");
			DataSt.arrayList.add(this.serViceName);
			Thread.sleep(this.delay);
			this.cunLen.countDown();
		} catch (Exception e) {

		}
	}

}

class CunTut2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
try {
	Thread.sleep(100000000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		for (String s:DataSt.arrayList){
			System.out.println(s);
		}
	}

}


class DataSt{
	public static ArrayList<String> arrayList = new ArrayList<>();
}