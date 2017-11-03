package com.mytree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestG test = new TestG(5);

		test.add(1);
		test.add(2);
		test.add(7);
		test.add(6);
		
//        test.getLeft();
//        
//        test.getRight();
        
        test.getLonestPath();
	}

}
