import java.util.Objects;

public class TreeTest {

int k=0;	
	
private TestG left = null;
private TestG right = null;	
	

public void add(TestG g){
	if(g.getI()<k){
		if(Objects.isNull(left)){
			left = new TestG();
			left.setI(g.getI());
		}else{
			left.setI(g.getI());
		}
	}else{
		if(Objects.isNull(right)){
			right =  new TestG();
			right.setI(g.getI());
		}else{
			right.setI(g.getI());
		}
		
	}
	
}

}

class TestG {
	int i = 0;

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return this.i;

	}

}
