package interviewquestion;

public class ImuAmbus {

	

	public void foo(IB s) {
		System.out.println("String");
	}

	public void foo(IC s){
		System.out.println("String");
	}
	
	public void foo(IA o) {
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
		IA obj = null;
		
		new ImuAmbus().foo(null);
	
	}

	
	
	public void foo(String s){
		System.out.println("String");
	}
}

class IA {

}

class IB extends IA {

}

class IC extends IA {

}