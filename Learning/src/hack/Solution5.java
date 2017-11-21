package hack;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution5 {

	public static void main(String...strings){
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.US);  
        String us=formatter.format(payment);  
        NumberFormat formatter2=NumberFormat.getCurrencyInstance(Locale.CHINA);  
        String china=formatter2.format(payment); 
        
        NumberFormat formatter3=NumberFormat.getCurrencyInstance(Locale.FRANCE);  
        String france=formatter3.format(payment); 
        
        NumberFormat formatter4=NumberFormat.getCurrencyInstance(new Locale("en","IN"));  
        String india=formatter4.format(payment); 
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
	
}
