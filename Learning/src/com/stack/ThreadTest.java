package com.stack;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TestMessage message = new TestMessage();
//		Runner a = new Runner(message);
//		Runner b = new Runner(message); 
//		Runner c = new Runner(message);
//		Runner d = new Runner(message);
//		
//		
//		a.start();
//		b.start();
//		c.start();
//		d.start();
		
		List<String> a = new ArrayList<String>();
		a.add("test");
		a.add("test2");
		a.add("test3");
		
		
	}

	static class Runner extends Thread {
		TestMessage message = null;

		public Runner(TestMessage message) {
			this.message = message;
		}

		public void run() {
			synchronized (message) {
				try {
					for (int i = 0; i <= 10; i++) {
						message.setMessage(Thread.currentThread().getName() + " " + i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
