package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CouncurrentLockTut {

	public static void main(String...strings) {
		Lock  lock =  new ReentrantLock();
		LockHome home = new LockHome(lock);
		for(int i =0;i<=3;i++) {
			ThLoc loc = new ThLoc(home, "msg"+i);
			Thread thread = new Thread(loc);
			thread.start();
		}
		
		
	}
	
}

class LockHome{
	Lock lock ;
	
	public LockHome(Lock lock) {
		// TODO Auto-generated constructor stub
		this.lock = lock;
	}
	
	public void method(String message) {
		System.out.println("applying lock for "+Thread.currentThread().getName());
		lock.lock();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
		System.out.println("lock realise for "+Thread.currentThread().getName());
	}
	
	
}

class ThLoc implements Runnable{
	LockHome home;  
	String message;
	public ThLoc(LockHome home,String message) {
		// ODO Auto-generated constructor stub
		this.home = home;
		this.message = message;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		home.method(message);
	}
	
	
}


