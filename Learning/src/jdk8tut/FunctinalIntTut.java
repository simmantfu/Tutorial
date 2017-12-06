package jdk8tut;

@FunctionalInterface
interface FunTut<T>{
  String write(T t);
  
  default int plus(T t){
	  
	  int result =0;
	  
	  if(t instanceof Integer){
		  result = (Integer)t+1;
	  }
	  
	return result;
	
  }
}


public class FunctinalIntTut {

	public static void main(String...strings){
		
		FunTut<Integer> f = (Integer i)-> Integer.toString(i);
		
		int k =0;
	    f.write(k);
		System.out.println(f.plus(k));
	}
	
	
}
