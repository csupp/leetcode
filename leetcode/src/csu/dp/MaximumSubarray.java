package csu.dp;

public class MaximumSubarray {
	public static int maxSubArray(int[] nums) {
		int curMax = 0;
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			curMax += nums[i];
			if (curMax > max) {
				max = curMax;
			}
			if (curMax < 0) {
				curMax = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4  };
		System.out.println(maxSubArray(nums));
	}
}
