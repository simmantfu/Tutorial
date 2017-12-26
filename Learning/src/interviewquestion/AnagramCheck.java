package interviewquestion;

import java.util.HashMap;

public class AnagramCheck {

	static boolean checkAng(String s1, String s2) {

		HashMap<String, Integer> map1 = countMap(s1);
		HashMap<String, Integer> map2 = countMap(s2);
		return map1.equals(map2);
	}

	static HashMap<String, Integer> countMap(String s1) {

		String[] sAray = s1.split("");
		HashMap<String, Integer> map = new HashMap<>();

		for (String k : sAray) {
			if (!map.containsKey(k)) {
				map.put(k, 1);
			} else {
				map.put(k, map.get(k) + 1);
			}
		}

		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(checkAng("lol", "lll")){
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}

	}

}
