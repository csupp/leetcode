package csu.characters;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a father , have a lovely daughter.";
		System.out.println(reverse(str));

	}

	public static String reverse(String str) {

		if (str.trim().length() == 0) {
			return str;
		}
		String[] temp = str.split(" ");
		String res = "";
		for (int i = temp.length - 1; i >= 0; i--) {
			res += temp[i];
			if (i != 0) {
				res += " ";
			}
		}

		return res;

	}

}
