package csu.array;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import csu.common.ListNode;

/**
 * 求两个有序集合的交集 时间复杂度O(m)
 * 
 * @author ricky
 *
 */
public class GetInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { -10, 6, 7 };
		int a[] = { -15, 1, 3, 4, 5, 6, 7, 8, 9, 10, 15 };
		System.out.println((getInterSection(a, b)));
	}

	public static ArrayList<Integer> getInterSection(int[] arr1, int[] arr2) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				res.add(arr1[i]);
				i++;
				j++;
				k++;

			}
		}

		return res;

	}

}
