package csu.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class RepeaterMaxStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println(getRepeaterMaxStr("aabbcccddda"));
		
	}
	
	
	public static String getRepeaterMaxStr(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		String result = "";
		
		if (str.length()==0) {
			return null;
		}
		for(int i=0; i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		int max = 0;
		HashSet<Character> set = new HashSet<Character>();
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>max) {
				max = entry.getValue();
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==max) {
				set.add(entry.getKey());
			}
		}
		
		
		for(Character c : set) {
			
		result += c+ ",";
		}
		
		return result +"都出现 " + max +" 次" ;
	}

}
