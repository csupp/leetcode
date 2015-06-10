package csu.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class wordBreak {
	public static boolean wordBreak(String s, Set<String> dict) {
		boolean[] f = new boolean[s.length() + 1];
		Arrays.fill(f, false);
		f[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j =0; j < i; j++) {
				if (f[j] && dict.contains(s.substring(j, i))) {
					f[i] = true;
					break;
				}
			}
		}
		return f[s.length()];

	}

	public static void main(String[] args) {
		String s = "leetcode";
		HashSet dict = new HashSet();
		dict.add("leet");
		dict.add("coee");
		dict.add("leetcode");
		System.out.println(wordBreak(s, dict));
		System.out.println("done");
	}

}
