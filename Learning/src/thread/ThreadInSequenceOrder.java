package thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class ThreadInSequenceOrder {

	public static void main(String... strings) {
		Queue<Thread> threads = new LinkedList<>();
		// ArrayList<Thread> threads = new ArrayList<>();

		HelloThread helloThread = new HelloThread();
		int k=10;
		for (int i = 1; i <= 10; i++) {
			Thread t = new Thread(helloThread);
			t.setName("thread" + k--);
			t.setPriority(i);
			threads.add(t);
		}

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Simmant");
		map.put(2, "Sam");
		map.put(3, "Sam1");

		// Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		// while(it.hasNext()){
		// Entry e = it.next();
		// it.remove();
		// }

		// for(Entry e:map.entrySet()){
		// map.remove(e.getKey());
		// }

		for (Thread t : threads) {
			try {
				t.start();
				t.join();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Iterator<Thread> it = threads.iterator();
		//
		// while(it.hasNext()){
		//
		// it.next().start();
		// it.remove();
		// }

		// This code will throw concurrent modification error
		// for(Thread d:threads){
		// try {
		// d.join();
		// threads.remove(d);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
	}

}

class HelloThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//Thread.sleep(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello from : " + Thread.currentThread().getName());
	}

}