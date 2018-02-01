package interviewquestion;

/*
 * Bubblesort

   1) compare 1st and 2nd elements
   2) if 1st larger than 2nd, swap
   3) compare 2nd and 3rd, and swap if necessary
   4) continue until compare the last two elements
   5) the largest element is now the last element in the array.
   6) repeat statring from the beginning until no swaps are performed (i.e.,
      the array is sorted)
   7) each time you go through the elements bubbling up the largest element
   8) no need to try the last i elements for the ith run since the end
   9) elements are already sorted


 * 
 * */


public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {9,8,7,6,5,4,3,2,1};
		
		for(int i = 0;i<a.length;i++){
		    for(int j = 0;j<a.length;j++) {
		    	int a1,b1;
		    	
		    	a1 = a[i];
		    	b1 = a[j];
		    	if(a1<b1) {
		    		
		    		a[j] = a1;
		    		a[i] = b1;
		    	}
		    	
		    }
		}
		
		for(int b:a) {
			System.out.println(b);
		}
	}

}
