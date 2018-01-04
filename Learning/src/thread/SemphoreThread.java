package thread;

import java.util.concurrent.Semaphore;

public class SemphoreThread {

	public static void main(String...strings) {
		Semaphore semaphore = new Semaphore(3);
		for(int i=0;i<=9;i++) {
			Threadsem threadsem = new Threadsem(semaphore, "msg"+i);
			Thread th = new Thread(threadsem);
			th.start();
		}
		
	}
	
	
}

class Threadsem implements Runnable{
	
	Semaphore semaphore;
	String message;
	
	public Threadsem(Semaphore semaphore,String message) {
		// TODO Auto-generated constructor stub
		
		this.semaphore = semaphore;
		this.message = message;
		
	}
	
	public void run(){
		
		try {
			Thread.sleep(1000);
			semaphore.acquire();
			System.out.println(message);
			Thread.sleep(1000);
			semaphore.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
