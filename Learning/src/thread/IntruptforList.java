package thread;

import java.util.ArrayList;
import java.util.List;

public class IntruptforList {

	public static void main(String[] args) {
		InpList inpList = new InpList();
		Thread thread = new Thread(inpList);
		thread.start();
        thread.interrupt(); 

	}

}

class InpList implements Runnable{

	static List<Integer> list = new ArrayList<Integer>(); 
	
	static{
		for(int i=0;i<=10000;i++){
			list.add(i);
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.interrupted()){
			System.out.println("Intrupted call");
		}
		for(int k:list){
			
			System.out.println(k);
		}
		
	}
	
	
	
}