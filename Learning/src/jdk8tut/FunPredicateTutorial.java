package jdk8tut;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunPredicateTutorial {

	
	public static void main(String...strings){
		
		List<Emp> listEmp = new ArrayList<Emp>();
		
		listEmp.add(new Emp(10,"Simmantv",150000));
		listEmp.add(new Emp(10,"Sounu",50000));
		listEmp.add(new Emp(10,"Kav",250000));
		
		EmpPred empPred = new EmpPred();
		
		empPred.filters(listEmp, empPred.isNameWithV()).forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
		empPred.filters(listEmp, empPred.isSalaryMoreThanLakh()).forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
	}
	
}

class Emp {

	 int id;
	 String name;
	 long salary;

	public Emp(int id,String name,long salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

class EmpPred {

	public Predicate<Emp> isNameWithV() {
		return k -> k.name.endsWith("v");
	}

	public Predicate<Emp> isSalaryMoreThanLakh() {
		return k -> k.salary > 100000;
	}

	
	public List<Emp> filters(List<Emp> emps, Predicate<Emp> predicate) {

		return emps.stream().filter(predicate).collect(Collectors.<Emp>toList());
	}

}
