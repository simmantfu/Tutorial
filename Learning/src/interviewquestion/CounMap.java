package interviewquestion;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class CounMap {
	static Map<Integer, String> m = new ConcurrentHashMap<>();
	
	static{
		
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
	}
	public static void main(String[] args) {
		
		
			for(int i = 5;i<=10;i++){
				m.put(i, ""+1);
			}
			
			
			
			for(Entry e:m.entrySet()){
			System.out.println(e.getKey());
			
			}

	}

}
