public class Maine extends Thread {

    static String all = "";
    String number;

    public Maine(String number) {
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