package com.mytree;

import java.util.Objects;

public class TreeTest {

	static int count = 0;

	static TestG test = null;

	public void add(int k) {

		if (count == 0) {
			test = new TestG(k);
		} else {
			test.add(k);
		}

	}

	public void getI() {
		test.getI();
	}

}

public class TestG {
	int i = 0;
	static int count = 0;

	private TestG left = null;
	private TestG right = null;

	TestG(int k) {
		this.count = this.count + 1;
		this.i = k;
		this.left = null;
		this.right = null;
	}

	public void add(int g) {
		if (g < this.i) {
			if (Objects.isNull(left)) {
				left = new TestG(g);

			} else {
				left.add(g);
			}
		} else {
			if (Objects.isNull(right)) {
				right = new TestG(g);

			} else {
				right.add(g);
			}

		}

	}

	public void getI() {
		System.out.println(this.i);

		if (this.left != null) {
			this.left.getI();
		}

		if (this.right != null) {
			this.right.getI();
		}
	}

	public void getLeft() {
		System.out.println(this.i);

		if (this.left != null) {
			this.left.getI();
		}

	}

	public void getRight() {
		System.out.println(this.i);

		if (this.right != null) {
			this.right.getI();
		}

	}
	
	public void getLonestPath(){
		if(this.count==this.left.count){
			System.out.println(this.count+" "+this.left.i);
		}else{
			this.left.getLonestPath();
		}
		
//		if(this.count>this.right.count){
//			this.right.getLonestPath();
//		}
		
		
	}
}
