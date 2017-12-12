package com.stack;

import java.util.Comparator;

public class CombandCompTut {

	public static void main(String...strings){
		ComObj comObj = new ComObj(1);
		ComObj comObj2 = new ComObj(2);
		ComObj comObj3 = new ComObj(3);
		
		ComObj2 conobj = new ComObj2(1);
		ComObj2 conobj1 = new ComObj2(0);
		ComObj2 conobj2 = new ComObj2(1);
		System.out.println(comObj.compare(comObj,comObj2));
		
		System.out.println(conobj.compareTo(conobj1));
	}
	
}

class ComObj implements Comparator<ComObj> {

	int k;
	
	public ComObj(int k) {
		// TODO Auto-generated constructor stub
		this.k = k;
	}

	@Override
	public int compare(ComObj o1, ComObj o2) {
		// TODO Auto-generated method stub
		
		if(o1.k == o2.k){
			return 0;
		}
		
		if(o1.k > o2.k){
			return 1;
		}
		else{
			return -1;
		}
		
	}

}

class ComObj2 implements Comparable<ComObj2>{

	int value;
	
	public ComObj2(int value){
		this.value = value;
	}
	
	@Override
	public int compareTo(ComObj2 o) {
		// TODO Auto-generated method stub
		int result  = (this.value == o.value?0:(this.value>o.value?1:-1));
		
		return result;
	}
	
}