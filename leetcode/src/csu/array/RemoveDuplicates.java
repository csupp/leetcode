package csu.array;

/**
 * Leetcode 26 
 * 数组完成排序后，我们可以放置两个指针i和j，其中i 是慢指针，而 j是快指针。只要 nums[i] =
 * nums[j]，我们就增加 j 以跳过重复项。
 *当我们遇到 nums[j] !=nums[i]时，跳过重复项的运行已经结束，因此我们必须把它（nums[j]）的值复制到 nums[i+1]。然后递增
 * i，接着我们将再次重复相同的过程，直到 j到达数组的末尾为止。
 * 
 * Java
 * 
 
 * @author ricky
 *
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int removeDuplicate(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}

		int i = 0;
		int j = 1;
		while (j < arr.length) {
			if (arr[j] != arr[j - 1]) {
				i++;
				arr[i] = arr[j];

			}
			j++;
		}
		return i + 1;
	}
}
