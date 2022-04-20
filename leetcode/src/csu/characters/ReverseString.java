package csu.characters;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IamWangKunPeng";
		System.out.println(reverseString(str));
		System.out.println(reverseString_stringBuffer(str));
		System.out.println(reverseString_stack(str));
	}

	/**
	 * Use CharArray to reverse string
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseString(String str) {

		if (str.length() < 2) {
			return str;
		}

		char[] chs = str.toCharArray();
		int i = 0;
		int j = chs.length - i - 1;

		while (i < j) {
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
			i++;
			j--;
		}

		return new String(chs);

	}


	/**
	 * Use StringBuffer to reverse string
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseString_stringBuffer(String str) {

		StringBuffer sf = new StringBuffer(str);
		sf.reverse();
		return sf.toString();
	}

	/**
	 * Use stack to reverse string
	 * 
	 * @param str
	 * @return
	 */

	public static String reverseString_stack(String str) {

		Stack s = new Stack();
		int i = 0;
		String res = "";
		while (i < str.length()) {
			s.push(str.charAt(i));
			i++;
		}
		while (!s.isEmpty()) {
			res += s.pop();
		}

		return res;
	}

}
