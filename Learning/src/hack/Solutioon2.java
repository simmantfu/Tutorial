package hack;
import java.util.Scanner;

public class Solutioon2 {

	static int B=-1;
	static int H=-1;
	static boolean flag =false;
	
	static{
		Scanner sc = new Scanner(System.in);
		B= sc.nextInt();
	    H=sc.nextInt();
	    
	    if(B<=0 || H<=0){
	    	 try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    }else{
	    	flag = true;
	    }
		
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

