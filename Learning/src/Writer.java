public class Writer {

  public static void main(String[] args) {
	  Maine w1 = new Maine("1");
	  Maine w2 = new Maine("2");
	  Maine w3 = new Maine("3");
	  Maine w4 = new Maine("4");
	  Maine w5 = new Maine("5");

    w1.start();
    w2.start();
    w3.start();
    w4.start();
    w5.start();
  }

  
 static class Maine2 extends Thread {

	   static String all = "";
	    String number;

	    public Maine2(String number) {
	        this.number = number;
	    }

	    public void run() {
	      synchronized (all) {
	        for(int i=0; i<5; i++) {
	            all += number;
	        }
	      }
	      System.out.println("End of thread "+number+": "+all);
	   }
	}
  
}