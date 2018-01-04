package thread;
// -- sleep(long) is native method
// -- sleep(long,mile) is static method which internally called sleep(long) method
// -- Yield() is also native method Causes the currently executing thread object to temporarily pause and allow other threads to execute.
public class ThreadRun extends Thread{

	
	
	public static void main(String...strings){
//		new ThreadRun().run();
//		new ThreadRun().start();
		
		Res res = new Res();
		
		Thra1 thr1 = new Thra1(res);
		Thra2 thr2 = new Thra2(res);
		
		Thread t = new Thread(thr1);
		Thread t2 = new Thread(thr2);
		
		t.start();
		t2.start();
	}
}



class Res{
	volatile int i = 5;
	public  void add(){
		
		i = i+6;
		
		System.out.println(Thread.currentThread().getName()+" "+i);
		
	}
	
}

class Thra1 implements Runnable{
Res res;
	Thra1(Res res){
		this.res = res;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res.add();
	}
	
}

class Thra2 implements Runnable{

	Res res;
	Thra2(Res res){
		this.res = res;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		res.add();
	}
	
}