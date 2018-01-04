package thread;

public class ThreadStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tes tes = new Tes();

		T1 t1 = new T1(tes);

		T2 t2 = new T2(tes);

		T3 t3 = new T3(tes);
		
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
		Thread tr3 = new Thread(t3);

		tr1.start();
		tr2.start();
		tr3.start();
	}

}

class Tes {

	static synchronized void add() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print("\n static " + i);
		}
	}

	synchronized void add2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print("\n norm 1 " + i);
		}
	}

	synchronized void add3() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print("\n norm3 " + i);
		}
	}

}

class T1 implements Runnable {

	Tes tes;

	T1(Tes tes) {
		this.tes = tes;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		tes.add();
	}

}

class T2 implements Runnable {

	Tes tes;

	T2(Tes tes) {
		this.tes = tes;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		tes.add2();
	}

}

class T3 implements Runnable {

	Tes tes;

	T3(Tes tes) {
		this.tes = tes;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		tes.add3();
	}

}
