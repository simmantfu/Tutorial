package interviewquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class CouncurrentforModification {

	static Map<Integer, String> m = new ConcurrentHashMap<>();

	static {

		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
	}

	public static void main(String... strings) {

		Thread d = new Thread(new T1());
		Thread d2 = new Thread(new T2());
		d.start();
		d2.start();

	}

	static class T1 implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 5; i <= 1000; i++) {
				m.put(i, "" + 1);
			}
		}

	}

	static class T2 implements Runnable {

		@Override
		public void run() {
			// add some time sleep to run correctly
			for (Entry e : m.entrySet()) {
				System.out.println(e.getKey());

			}

		}

	}

}
