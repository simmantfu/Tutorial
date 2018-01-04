package thread;

public class Deadlocal2 {
	static String string = new String("test");
	static String string2 = new String("test2");

	public static void main(String... strings) {
		Thr1 thr1 = new Thr1();
		Thr2 thr2 = new Thr2();
		thr1.start();
		thr2.start();
	}

	static class Thr1 extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (string) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(string);

				synchronized (string2) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(string2);
				}
			}
		}

	}

	static class Thr2 extends Thread{
    	
    	@Override
    	public void run() {
    		// TODO Auto-generated method stub
    		synchronized (string) {
    			
    			try {
    				Thread.sleep(1000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			System.out.println(string);
               
    			synchronized (string2) {
    				try {
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    				System.out.println(string2);
    			}
    		}
    	
    	
   }
	
}
}
