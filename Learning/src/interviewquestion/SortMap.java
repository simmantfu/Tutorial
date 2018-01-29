package interviewquestion;

import java.util.*;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> unsortMap = new HashMap<>();

		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(6, "a");
		unsortMap.put(20, "c");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(8, "y");
		unsortMap.put(99, "n");
		unsortMap.put(50, "j");
		unsortMap.put(2, "m");
		unsortMap.put(9, "f");

		for (Map.Entry<Integer, String> e : getSortByComprator(unsortMap).entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

	// Sort in natural order
	static Map<Integer, String> getSortByTree(Map map1) {
		Map<Integer, String> tMap = new TreeMap<>(map1);

		return tMap;

	}

	// Sort in natural order
	static Map<Integer, String> getSortByComprator(Map<Integer, String> map1) {
		Map<Integer, String> tMap = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				// return arg0.compareTo(arg1);
				return arg1.compareTo(arg0);

			}
		});

		tMap.putAll(map1);

		return tMap;

	}

}
