package csu.array;

import java.util.Arrays;

/**
 * Leetcode 88 合并两个有序数组
 * 同时比较两个数组nums1和nums2中最大的数，把最大的数放在m+n-1的位置，然后位置-1，最大数所在数组位置-1，继续比较，直到nums2遍历完成。
 * 
 * @author ricky
 *
 */
public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 0, 0, 0, 0, 0 };
		int m = 1;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		mergeList(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	public static void mergeList(int[] nums1, int m, int[] nums2, int n) {
		int pos = m + n - 1;
		while (n > 0) {
			if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
				nums1[pos--] = nums1[--m];

			} else {
				nums1[pos--] = nums2[--n];

			}
		}
	}
}
