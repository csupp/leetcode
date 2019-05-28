package csu.base;

public class HanoTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swapCount(20));
		swapPath(3, 'A', 'B', 'C');
	
	}

	public static int swapCount(int num) {
		int count = 0;
		if (num == 1) {
			count++;
			return 1;
		}

		return 2 * swapCount(num - 1) + 1;
	}

	public static void swapPath(int num, Character A, Character B, Character C) {
		if (num == 1) {
			System.out.println(A + "-->" + C);
			return;
		}

		swapPath(num - 1, A, C, B);
		System.out.println(A + "-->" + C);
		swapPath(num - 1, B, A, C);

	}

}
