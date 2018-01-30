package interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class OverrideEqulls {

	public static void main(String...strings){
		Emp emp = new Emp(1, "test", 1000);
		Emp emp2 = new Emp(2, "test1", 1000);
		Emp emp3 = new Emp(3, "test2", 1000);
		
		List<Emp> emps= new ArrayList<Emp>();
		emps.add(emp);
		emps.add(emp2);
		emps.add(emp3);
		
		Emp emp4 = new Emp(1, "test", 1000);
		
		if(emps.contains(emp4)){
			System.out.println("I am here");
		}		
				
	}
	
	
}

class Emp {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		Emp emp = (Emp) obj;
		if (emp.name.equals(this.name) && emp.id == this.id) {
			return true;
		}

		else {
			return false;
		}
	}

	int id;
	String name;
	double salary;

	Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}