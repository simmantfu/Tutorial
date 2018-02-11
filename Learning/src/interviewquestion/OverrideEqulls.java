package interviewquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OverrideEqulls {

	public static void main(String... strings) {
		Emp emp = new Emp(1, "test", 1000);
		Emp emp2 = new Emp(1, "test", 1000);
		// Emp emp3 = new Emp(3, "test2", 1000);

		// List<Emp> emps= new ArrayList<Emp>();
		// emps.add(emp);
		// emps.add(emp2);
		// emps.add(emp3);
		//
		// Emp emp4 = new Emp(1, "test", 1000);
		//
		// if(emps.contains(emp4)){
		// System.out.println("I am here");
		// }

		Set<Emp> emps = new HashSet<>();
		emps.add(emp);
		emps.add(emp2);

		System.out.println(emps.size());

	}

}

class Emp {

	int id;
	String name;
	double salary;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = java.lang.Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		boolean result = false;

		if (obj == this) {
			return true;
		}

		if (!(obj instanceof Emp)) {
			return false;
		}

		Emp emp = (Emp) obj;

		return name.equals(emp.name) && salary == emp.salary;
	}

	Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}