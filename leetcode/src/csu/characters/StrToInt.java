package csu.characters;

import java.util.Arrays;

public class StrToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrToInt("123456"));
		System.out.println(StrToInt("+23456"));
		System.out.println(StrToInt("-23456"));
		String [] strs= {"abcdefs","abdss","ab"};
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));

	}

	public static int StrToInt(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int flag = 0;
		if (str.charAt(0) == '+') {
			flag = 1;
		}
		if (str.charAt(0) == '-') {
			flag = 2;
		}
		int res = 0;
		int start = flag > 0 ? 1 : 0;
		while (start < str.length()) {
			if (str.charAt(start) > '9' || str.charAt(start) < '0') {
				return 0;
			} else {
				res = res * 10 + (str.charAt(start) - '0');
				start++;
			}
		}

		return flag == 2 ? -res : res;

	}

}
