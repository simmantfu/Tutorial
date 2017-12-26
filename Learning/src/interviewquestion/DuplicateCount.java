package interviewquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCount {

	static Map checkDup(String str){
		
		String[] sArry = str.split(" ");
		Map<String, Integer> st = new HashMap<>();
		for(String s:sArry){
			if(!st.containsKey(s)){
				st.put(s, 1);
			}else{
				st.put(s, st.get(s)+1);
			}
		}
		return st;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = checkDup("The world of love but world is not of love");
        Set<Map.Entry<String, Integer>> mSet = map.entrySet();
		for(Map.Entry<String, Integer> ldata : mSet){
			if(ldata.getValue()>1){
				System.out.println(ldata.getKey()+" "+ldata.getValue());
			}			
		}
	}

}
