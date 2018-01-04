package interviewquestion;

public class Classcalling {

	public static void main(String...strings){
		A a =  new B();
		a.hello();
		a.main();
		
		
	}
	
}

class A{
	
	static void hello(){
		System.out.println("from hello");
	}
	
	public void main(){
		System.out.println("from hello main");
	}
	
}


class B extends A{
	static void hello(){
		System.out.println("from hello B");
	}
	
	public void main(){
		System.out.println("from hello main2");
	}
}