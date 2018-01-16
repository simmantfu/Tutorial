package interviewquestion;

/*
 * Selection Sort

    1)array to be sorted: A
    2) array to be returned: B
    3) find smallest element in A and put in B
    4) mark space in A with null so it won’t be chosen again
    5) repeat last two steps until B is sorted array


 * 
 * */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int b[] = new int[a.length]; 
		
		for(int i = 0;i<a.length;i++) {
			int k = min(a);
			
			b[i] = k;
			
		}
		
       for(int k:b) {
    	   System.out.println(k);
       }
		

	}

	static int min(int a[]) {

		int x = a[0];
		int cur = 0;

		
		for (int i = 1; i < a.length; i++) {

			if (x > a[i] && a[i] != 0) {
				x = a[i];
				cur = i;
			}

		}

		a[cur] = 0;
		
		return x;

	}

}
