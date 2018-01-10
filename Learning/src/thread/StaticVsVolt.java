package thread;

public class StaticVsVolt {

	public static void main(String...strings){
		Base base = new Base();
		
		for(int i =1;i<=1000;i++){
			StatThr statThr= new StatThr(base);
			Thread thread = new Thread(statThr);
			thread.setName("stat"+i);
			thread.start();
		}
		
		for(int i =1;i<=1000;i++){
			StatThr2 statThr2= new StatThr2(base);
			Thread thread = new Thread(statThr2);
			thread.setName("vol"+i);
			thread.start();
		}
		
	}
	
}

class Base{
	static int i = 5;
	volatile int j = 5;
	
	public void update(){
		i = i+5;
		
		if(Thread.currentThread().getName().equals("stat1000")){
			System.out.println("value of statis "+i);
		}
		
	}
	
	public void update2(){
		j = j+5;
		if(Thread.currentThread().getName().equals("vol1000")){
			System.out.println("value of volt "+j);
		}
		
	}
	
	
}


class StatThr implements Runnable{

	Base base;
	
	StatThr(Base base){
		this.base = base;
	}
	
	
	@Override
	public void run() {
		base.update();
	}
	
}

class StatThr2 implements Runnable{

	Base base;
	
	StatThr2(Base base){
		this.base = base;
	}
	
	
	@Override
	public void run() {
		base.update2();;
	}
	
}
