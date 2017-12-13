package com.stack;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int mid =(int) a[a.length/2];
		
		Object[] a1 = quickSort(a, new ComforSmall(mid));
		Object[] a2 = quickSort(a,  new ComforBig(mid));

		
		
		System.arraycopy(a1, 0, a, 0, a1.length);
		System.arraycopy(a2, 0, a, a.length/2, a2.length);
		
		a[(a.length/2)-1] = mid;
		
		for(Object d:a){
			System.out.println(d);
		}
	}

	static Object[] quickSort(Object[] array, QuickInter inter) {

		List<Integer> list = new ArrayList<Integer>();

		for (Object a : array) {

			if (inter.compareTo((int)a) == 1) {
				list.add((int)a);

			}
		}

		return list.toArray();
	}

}

interface QuickInter extends Comparable<Integer> {

}

class ComforSmall implements QuickInter {

	int value;

	public ComforSmall(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub

		if (this.value == o) {
			return 0;
		}

		if (this.value > o) {
			return 1;
		} else {
			return -1;
		}

	}

}

class ComforBig implements QuickInter {

	int value;

	public ComforBig(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub

		if (this.value == o) {
			return 0;
		}

		if (this.value < o) {
			return 1;
		} else {
			return -1;
		}

	}

}
