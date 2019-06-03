package csu.characters;

import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leettl"));
		System.out.println(firstUniqChar("leettlo"));
		System.out.println(firstUniqChar(""));
		System.out.println(firstUniqChar2("leettl"));
		System.out.println(firstUniqChar2("leettlo"));
		System.out.println(firstUniqChar2(""));
	}

	public static int firstUniqChar(String s) {

		if (s.length() == 0) {
		}
		char[] str = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character cha : str) {
			if (map.containsKey(cha)) {
				map.put(cha, map.get(cha) + 1);
			} else {
				map.put(cha, 1);
			}
		}

		for (int i = 0; i < str.length; i++) {
			if (map.get(str[i]) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static int firstUniqChar2(String s) {
		char[] str = s.toCharArray();
		int[] count = new int[26];
		for (Character cha : str) {
			count[cha - 'a']++;
		}
		for (int i = 0; i < str.length; i++) {
			if (count[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
