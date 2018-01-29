package interviewquestion;

public class ImutableClass {

	public static void main(String...strings){
		
		ImutTEst est  = new ImutTEst(1, "Simmant");
		ImutTEst est2  = new ImutTEst(1, "Simmant");
	
		String s = new String("test");
		String t = new String("test");
		
	    System.out.println(est.hashCode()); 
	    System.out.println(est2.hashCode());
	}
}


final class ImutTEst{
	
	int id=0;
	String name="";
	
	ImutTEst(int id,String name){
		this.id =id;
		this.name =  name;
	}
	
	int getId(){
		return this.id;
	}
	
	String getName(){
	 return this.name;
	}
}

