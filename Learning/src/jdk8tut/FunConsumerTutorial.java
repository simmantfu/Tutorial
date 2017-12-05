package jdk8tut;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunConsumerTutorial {

	public static void main(String... s) {
		List<Student> studentList = new ArrayList<Student>();
		StudentUpdate studentUpdate = new StudentUpdate();

		studentList.add(new Student(1, "Simmant", "C"));
		studentList.add(new Student(2, "Simmant1", "C"));
		studentList.add(new Student(3, "Simmant2", "C"));

		studentUpdate.update(studentList, studentUpdate.updateRankToA());

		for (Student s1 : studentList) {
			System.out.println(s1.id + " " + s1.name + " " + s1.rank);
		}
	}

}

class Student {

	int id;
	String name;
	String rank;

	public Student(int id, String name, String rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
}

class StudentUpdate {

	public Consumer<Student> updateRankToA() {

		return s -> s.rank = "A";
	}

	public Consumer<Student> updateRankToB() {

		return s -> s.rank = "B";
	}

	public void update(List<Student> stu, Consumer<Student> consumer) {
		stu.forEach(consumer);
	}
}