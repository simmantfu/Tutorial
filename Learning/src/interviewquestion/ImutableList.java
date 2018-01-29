package interviewquestion;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ImutableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lsd = new ArrayList<Integer>();
		lsd.add(1);
		lsd.add(2);
		lsd.add(3);
		lsd.add(4);

		ImList imList = new ImList(lsd);
		imList.getLis().add(5);
		imList.getLis().add(6);
		imList.getLis().add(7);
		imList.getLis().add(8);

		for (int k : imList.getLis()) {
			System.out.println(k);
		}

	}

	static class ImList extends AbstractList<Integer> {

		private final List<Integer> list;

		public ImList(List list) {
			this.list = list;
		}

		@Override
		public Integer get(int index) {
			// TODO Auto-generated method stub
			return this.list.get(index);
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return this.list.size();
		}

		public List<Integer> getLis() {
			return new ArrayList<>(list);
		}

	}

}
