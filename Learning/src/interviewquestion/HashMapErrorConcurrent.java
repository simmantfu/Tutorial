package interviewquestion;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapErrorConcurrent {

	static Map<Integer, String> m = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m = Collections.synchronizedMap(m);
		
		Thread d = new Thread(new T1(0,1000));
		Thread d3 = new Thread(new T1(0,1000));
		Thread d2 = new Thread(new T2());
		d.start();
		d3.start();
		d2.start();
	}

	static class T1 implements Runnable {

		int i,end;
		
		T1(int i,int end){
			this.i = i;
			this.end = end;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int j = this.i; j <= this.end; j++) {
				m.put(j, "" + 1);
			}
		}

	}

	static class T2 implements Runnable {

		@Override
		public void run() {

			for (Entry e : m.entrySet()) {
				System.out.println(e.getKey());

			}

		}

	}
	
	
}
