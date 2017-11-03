
public class SyncVsNormal {

	public static void main(String... ar) throws InterruptedException {
		TableUtil tableUtil = new TableUtil();
		RunTest runTest = new RunTest(tableUtil);

		Thread thread = new Thread(runTest, "t1");
		thread.start();

		Thread thread2 = new Thread(runTest, "t2");
		thread2.start();

		Thread thread3 = new Thread(runTest, "t3");
		thread3.start();
		
		thread.join();
		thread2.join();
		thread3.join();
		
	}

}

class RunTest implements Runnable {

	private TableUtil tableUtil = null;

	public RunTest(TableUtil tableUtil) {
		this.tableUtil = tableUtil;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		process();
		tableUtil.normal();
		tableUtil.syncnormal();
	}

	private void process() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class TableUtil {
static int count=0;
	TestBTree test = new TestBTree(5000);
	
	public void normal() {
		int sum = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= 10; j++) {
				int k = i * j;
				sum = sum + k;
				count = count+1;
				test.add(count);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("total time :" + (startTime - endTime));
		System.out.println("normal sum: " + sum);
	}

	public synchronized void syncnormal() {
		int sum = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= 10; j++) {
				int k = i * j;
				sum = sum + k;
				count = count+1;
				test.add(count);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("total time :" + (startTime - endTime));
		System.out.println("synch sum: " + sum);
	}

}