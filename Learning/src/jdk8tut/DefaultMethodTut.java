package jdk8tut;

public class DefaultMethodTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Int1 s = (String s1) -> {return IntImple.hello1(s1);};


}

}
class IntImple implements Int1,Int2 {

	@Override
	public int hello(String s) {
		// TODO Auto-generated method stub
		System.out.println(""+s);
		
		return s.length();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		Int2.super.log();
	}
	
	public static int hello1(String s) {
		// TODO Auto-generated method stub
		System.out.println(""+s);
		
		return s.length();
	}
	
}

@FunctionalInterface
interface Int1{
	
	int hello(String s);
	
default void log(){
	System.out.println("log from Int1");
}
	
}


@FunctionalInterface
interface Int2{
	
	void hello();

	default void log(){
		System.out.println("log from Int2");
	}
	
}