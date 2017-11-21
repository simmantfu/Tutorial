package hack;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution16 {

	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);
		BigInteger b1 = sc.nextBigInteger();
		BigInteger b2 = sc.nextBigInteger();

		//System.out.println(b1.toString().length());
		if((b1.toString().length()<=200 && b2.toString().length()<=200) &&(!b1.toString().startsWith("-") && !b2.toString().startsWith("-")) ){
		System.out.println(b1.multiply(b2));
		System.out.println(b1.add(b2));
		}
	}

}
