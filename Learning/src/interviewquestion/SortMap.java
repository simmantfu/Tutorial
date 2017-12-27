package interviewquestion;

import java.util.*;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map  = new HashMap<>();
		
		map.put(10, "test");
		map.put(5, "test1");
		map.put(7, "test2");
		map.put(8, "test3");
		map.put(9, "test4");
		Set<Integer> setI = map.keySet();
		
		for(int i : setI){
			map.put(i, map.get(i));
		}
		
		System.out.println(map);
	}

}
