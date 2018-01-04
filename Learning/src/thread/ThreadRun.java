package thread;
// -- sleep(long) is native method
// -- sleep(long,mile) is static method which internally called sleep(long) method
// -- Yeld() is also neative method Causes the currently executing thread object to temporarily pause and allow other threads to execute.
public class ThreadRun extends Thread{

	public static void main(String...strings){
		new ThreadRun().run();
		new ThreadRun().start();
		
	}
}


