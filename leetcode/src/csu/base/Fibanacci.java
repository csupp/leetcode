package csu.base;

import org.omg.IOP.TaggedComponentHelper;

public class Fibanacci {

	public static void main(String[] args) {

		System.out.println(fab2(64));
		System.out.println(fab1(64));
	}

	/**
	 * 递归实现 时间复杂度： 2的n次方 ,空间复杂度：O(n)
	 * 
	 * @param n
	 * @return
	 */
	public static long fab(long n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		return fab(n - 1) + fab(n - 2);

	}

	/**
	 * 递推实现 时间复杂度：O(n), 空间复杂度O(1)
	 * 
	 * @param n
	 * @return
	 */
	public static int fab1(int n) {
		int a = 1, b = 1, c = 0;
		if (n <= 2) {
			return 1;
		} else {
			for (int i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}

		return c;

	}

	/**
	 * 利用数组递推实现 时间复杂度：O(n),空间复杂度 O(n)
	 * 
	 * @param n
	 * @return
	 */
	public static int fab2(int n) {
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		if (n <= 2) {
			return 1;
		}
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[n - 1];
	}

}
