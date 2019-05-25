package csu.base;

public class SubStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1234abc123abc123abc565abc123abc";
		String s2 = "abc";
		System.out.println("Replace method result:" + getSubStringCountByReplace(s2, s1));
		System.out.println("Common method result:" + getSubStringCount(s2, s1));

	}

	public static int getSubStringCountByReplace(String s1, String s2) {
		String s = s1.replaceAll(s2, ",");
		int res = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ',') {
				res++;
			}
		}
		return res;

	}

	public static int getSubStringCount(String s1, String s2) {
		int i = 0;
		int j = 0;
		int count = 0;
		if (s1.length() < s2.length()) {
			return 0;
		}
		while (i < s1.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				if (j == s2.length() - 1) {
					count++;
					j = 0;
				} else {
					j++;
				}

			} else {

				j = 0;
			}
			i++;

		}

		return count;
	}

}
