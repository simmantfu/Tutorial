package interviewquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeSort {

	public static void main(String ar[]) {

		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		Object[] a1 = sorted(a, 0, a.length/2);
		Object[] a2 =sorted(a, a.length/2, a.length);
		
		for(int i=0;i<a.length/2;i++){
			a[i] = (int) a1[i];
		}

		for(int i=a.length/2,j=0;i<a.length;i++){
			a[i] = (int) a2[j];
			j++;
		}
		
		for(int k:a){
			System.out.println(k);
		}
	}

	static Object[] sorted(int[] a, int start, int end) {

		List<Integer> list = new ArrayList<>();
		for (int i = start; i < end; i++) {
			list.add(a[i]);
		}

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 == 02) {
					return 0;
				}

				if (o2 < o1) {
					return 1;
				} else {
					return -1;
				}

			}
		});

		return list.toArray();
	}

}
