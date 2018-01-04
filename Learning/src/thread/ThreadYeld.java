package thread;

/*
 * SLEEP VS YELD
 * sleep() causes the thread to definitely stop executing for a given amount of time; 
 * if no other thread or process needs to be run, the CPU will be idle (and probably enter a power saving mode).

    yield() basically means that the thread is not doing anything particularly important and 
    if any other threads or processes need to be run, they should. Otherwise, 
    the current thread will continue to run.
 * 
 * 
 * */

public class ThreadYeld {

	public static void main(String... strings) {
		Res rs = new Res();
		Th1 th1 = new Th1(rs);
		Th2 th2 = new Th2(rs);

		th1.start();
		th2.start();
	}

}

class Res {

	public void runner() {

		System.out.print("\n Thread " + Thread.currentThread().getName() + " enterd");
		if (Thread.currentThread().getName().equals("test1")) {
			System.out.print("\n inside yeld for " + Thread.currentThread().getName());
			Thread.yield();
			System.out.print("\n exisiting yeld for " + Thread.currentThread().getName());
		}
		System.out.print("\n Thread " + Thread.currentThread().getName() + " exit");
	}

}

class Th1 extends Thread {

	Res rs;

	Th1(Res rs) {
		this.rs = rs;
		super.setName("test1");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		rs.runner();
	}

}

class Th2 extends Thread {

	Res rs;

	Th2(Res rs) {
		this.rs = rs;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		rs.runner();
	}

}