package thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProdConsumer {

	public static void main(String...strings){
		Restorent restorent  = new Restorent();
		for(int i=0;i<10;i++) {
			Thread1 thread1 = new Thread1(restorent, "dish"+i);
			Thread th = new Thread(thread1);
			th.start();
		}
		
		Thread2 thread2 = new Thread2(restorent);
		Thread th = new Thread(thread2);
		th.start();
		
	}
	
}

class Restorent {

	Map<String, String> dishList = new HashMap();

	public synchronized void customer(String dishname) {

		try {
			
			dishList.put(dishname, "preparing");
			System.out.println(dishname + " " + dishList.get(dishname));
			wait();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(dishname + " " + dishList.get(dishname));
	}

	public synchronized void kicthced() {

		
		
		try {
			Thread.sleep(5000);
			Set<String> s = dishList.keySet();
			
			for(String s1:s) {
				
				dishList.put(s1, "prepared");
			}
			
			notifyAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Thread1 implements Runnable{

	Restorent res;
	String dishName;
	public Thread1(Restorent res,String dishName) {
		this.res = res;
		this.dishName = dishName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res.customer(this.dishName);
	}
	
}

class Thread2 implements Runnable{

	Restorent res;
	String dishName;
	public Thread2(Restorent res) {
		this.res = res;
		this.dishName = dishName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res.kicthced();
	}
	
}
