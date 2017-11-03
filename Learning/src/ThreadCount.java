
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCount {

	public static void main(String... ar) throws InterruptedException {
		// Ttest g = new Ttest();
		//
		// Thread t = new Thread(g);
		// t.start();
		// Thread t2 = new Thread(g);
		// t2.start();
		// Thread t3 = new Thread(g);
		// t3.start();
		//
		// t.join();
		// t2.join();
		// t3.join();
		//
		// System.out.println(g.getCount());

		Ttest worker = null;
		ExecutorService executor = Executors.newFixedThreadPool(1);
		for(int i=0;i<3;i++){
			worker = new Ttest();
			executor.execute(worker);
		}
		executor.shutdown();
		// Wait until all threads are finish
		 executor.awaitTermination(33, TimeUnit.SECONDS);

		System.out.println(worker.getCount());
	}

}

class Ttest implements Runnable {

	AtomicInteger ato = new AtomicInteger();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			processSomeThing();
			this.ato.incrementAndGet();
		}

	}

	public int getCount() {
		return this.ato.get();
	}

	private void processSomeThing() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}