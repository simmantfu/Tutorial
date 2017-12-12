package com.stack;

public class CustomTree {
	static int leftDepth =0;
	static int rightDepth =0;

	public static void main(String... strings) {

		
		
		CustomT customT = new CustomT(10);
		customT.add(20);
		customT.add(4);
		customT.add(5);
		customT.add(3);
		customT.add(21);
		customT.add(11);
		customT.add(4);
		customT.add(5);
		customT.print();
		customT.printZigZag();
		customT.checkdepth();

	}

}

class CustomT {

	int data;

	CustomT left;
	CustomT right;
	
	

	public CustomT(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		
	}

	public void add(int add) {

		if (add < data) {

			if (this.left == null) {
				this.left = new CustomT(add);
			} else {
				this.left.add(add);
			}

		} else {
			if (add > data) {
				if (this.right == null) {
					this.right = new CustomT(add);
				} else {
					this.right.add(add);
				}
			}
		}

	}

	public void print() {
		System.out.println(this.data);
		if (this.left != null)
			this.left.print();

		if (this.right != null)
			this.right.print();
	}

	public void printZigZag() {
		System.out.println(this.data);
		if (this.left.right != null) {
			System.out.println(this.left.data);
			this.left.right.print();
		}
		if (this.right.left != null) {
			System.out.println(this.right.data);
			this.right.left.print();
		}
	}

	public void checkdepth() {
     if(this.left != null){
    	 CustomTree.leftDepth++;
    	 this.left.checkdepth();
     }
     if(this.right != null){
    	 CustomTree.rightDepth++;
    	 this.right.checkdepth();
     }
     
     if(this.left == null && this.right == null)
     System.out.println( (CustomTree.leftDepth+CustomTree.rightDepth)+1);
     
	}
	
}
