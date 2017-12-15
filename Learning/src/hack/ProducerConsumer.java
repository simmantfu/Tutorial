package hack;

public class ProducerConsumer {

	public static void main(String...strings){
		Factory factory = new Factory();
		
		for(int i=0;i<3;i++){
			Prod prod = new Prod(factory, "S"+i);
			Thread thread = new Thread(prod);
			thread.start();
		}
		
		Cons cons = new Cons(factory);
		Thread thread = new Thread(cons);
		thread.start();
		
		Thread thread1 = new Thread(cons);
		thread1.start();
	}
	
	
}


class Factory{
	
	private static String[] s = new String[3];
	
	static int count = 0;
	
	public synchronized void createData(String data){
		
		s[count] = data; 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count == 2){
			notifyAll();
		}
		count++;
	}
	
	public synchronized void useData(){
		try {
			wait();
			for(String s1:s){
				System.out.println(s1+" "+Thread.currentThread().getName());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Cons implements Runnable{

	Factory factory;
	
	Cons(Factory factory){
		this.factory = factory;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		factory.useData();
	}
	
}


class Prod implements Runnable{

	Factory factory;
	String data;
	
	Prod(Factory factory,String data){
		this.factory = factory;
		this.data = data;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		factory.createData(this.data);
	}
	
}