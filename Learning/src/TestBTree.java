import java.util.Objects;

import com.mytree.TestG;

public class TestBTree {
	int i = 0;
	
	static int count = 0;

	private TestBTree left = null;
	private TestBTree right = null;

	TestBTree(int k) {
		this.count = this.count + 1;
		this.i = k;
		this.left = null;
		this.right = null;
	}

	public void add(int g) {
		if (g < this.i) {
			if (Objects.isNull(this.left)) {
				this.left = new TestBTree(g);

			} else {
				this.left.add(g);
			}
		} else {
			if (Objects.isNull(this.right)) {
				this.right = new TestBTree(g);

			} else {
				
				System.out.println("value is of :"+g);
				this.right.add(g);
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
