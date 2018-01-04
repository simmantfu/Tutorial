package thread;

public class Deadlock {

	public static void main(String... strings) {

		Resource resource1 = new Resource();
		Resource resource2 = new Resource();
		Thr1 thr1 = new Thr1(resource1,resource2);
		Thr2 thr2 = new Thr2(resource1,resource2);

		thr1.start();
		thr2.start();

		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Util {

	public static void sleep() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Resource {

	public void forone(Resource res) {

		System.out.println("From method 1");
		Util.sleep();
		res.fortwo(this);
	}

	public void fortwo(Resource res) {
		System.out.println("From method 2");
		Util.sleep();
		res.forone(this);
	}
}

class Thr1 extends Thread {

	Resource res1;
	Resource res2; 
	public Thr1(Resource res1,Resource res2) {
		this.res1 = res1;
		this.res2 = res2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("from thread one");
		res1.forone(res2);

	}

}

class Thr2 extends Thread {
	
	Resource res1;
	Resource res2; 
	public Thr2(Resource res1,Resource res2) {
		this.res1 = res1;
		this.res2 = res2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("from thread two");
		res2.forone(res1);
	}
}