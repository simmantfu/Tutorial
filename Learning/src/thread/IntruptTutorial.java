package thread;

public class IntruptTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inup1 inup1 = new Inup1();
		Thread thread = new Thread(inup1);
		thread.start();
		thread.interrupt();
		
	}

}

class Inup1 implements Runnable{

	@Override
	public void run() {
		
		try{
			
			Thread.sleep(10000);
			System.out.print("Hello from Intrupt");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	
	
}