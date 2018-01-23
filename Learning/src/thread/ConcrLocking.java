package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcrLocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConRes c = new ConRes();
		Lock lock = new ReentrantLock();

		CunThread1 cunThread1 = new CunThread1(c, lock);
		Thread thread = new Thread(cunThread1);
		Thread thread2 = new Thread(cunThread1);
		thread.setName("tester");
		thread2.setName("tester2");
		thread.start();
		thread2.start();

	}

}

class CunThread1 implements Runnable {

	ConRes c;
	Lock lock;

	CunThread1(ConRes c, Lock lock) {
		this.c = c;
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.print("\n enterd " + name);
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				c.service(name);
			}

		} catch (Exception e) {
			System.out.println(e.toString());

		} finally {
			System.out.print("\n realise " + name);
			lock.unlock();

		}

	}

}

class ConRes {

	public void service(String name) {

		if (name.equals("tester")) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
