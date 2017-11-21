package hack;
import java.util.Scanner;

public class Solution19 {
	
	static int getHyt(int[][] a){
		
		int r1=0,r2=1,r3=2;
		
		
		
		for(int i=0; i < 2; i++){
			int c1=0,c2=1,c3=2;
			int[] a1 = new int[3];
            int[] a2 = new int[3];
            int[] a3 = new int[3];
            
            if(i==1){
            	r1 = r1+3;
            	r2 = r2+3;
            	r3 = r3+3;
            }
            
            for(int j=0; j < 2; j++){
                if(j==1){
                	c1 = c1+3;
                	c2 = c2+3;
                	c3 = c3+3;
                }
                a1[0] = a[r1][c1];a1[1] = a[r1][c2];a1[2]=a[r1][c3];
                a2[0] = a[r2][c1];a2[1] = a[r2][c2];a2[2]=a[r2][c3];
                a3[0] = a[r3][c1];a3[1] = a[r3][c2];a3[2]=a[r3][c3];
                
                System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
                System.out.println(a2[0]+" "+a2[1]+" "+a2[2]);
                System.out.println(a3[0]+" "+a3[1]+" "+a3[2]);
            }
            
            
        }
		
		return 0;
	}
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        getHyt(arr);
	    }
	 
	 
}
