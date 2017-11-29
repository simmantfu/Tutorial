package com.stack;

import java.util.Scanner;

interface Tes {
	public void hello();
}

class A implements Tes {

	static{
		System.out.println("Hello static a");
		
	}
	{
		System.out.println("Hello Init a");
		
	}
	@Override
	public void hello() {
		System.out.println("Hello a");

	}

}

class B implements Tes {

	@Override
	public void hello() {
		System.out.println("Hello b");

	}

}

public class Tester {

	public static void main(String... strings)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] name = { "com.stack.A", "com.stack.B" };
		Tes t;
		Class.forName(name[0]);
		if (a.equals("a")) {
			t = (Tes) Class.forName(name[0]).newInstance();
			t.hello();
		} else {
			if (a.equals("b")) {
				t = (Tes) Class.forName(name[1]).newInstance();
				t.hello();
			}
		}

	}

}
