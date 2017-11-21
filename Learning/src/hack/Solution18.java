package hack;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution18 {

	public static void main(String... strings) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		String result = n.isProbablePrime(1)==true?"prime":"not prime"; 
		System.out.println(result);

	}

}
