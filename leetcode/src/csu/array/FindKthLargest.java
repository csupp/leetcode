package csu.array;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.xml.transform.Templates;

public class FindKthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int k = 6;
		// System.out.println(findKthLargest(nums, k));
		System.out.println(findKthLargest_quickSort(nums, 0, nums.length - 1, 5));
	}

	/**
	 * 运用Java 库函数先排序，然后取数组第(nums.length-k)个元素
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	/**
	 * 结合快速排序，获取index， 如果index等于nums.length-k 即返回值
	 * 
	 * @param nums
	 * @param low
	 * @param high
	 * @param k
	 * @return
	 */
	public static int findKthLargest_quickSort(int[] nums, int low, int high, int k) {
		while (low < high) {
			int index = getIndex(nums, low, high, k);
			if (index == nums.length - k) {
				System.out.println(Arrays.toString(nums));
				return nums[index];
			} else if (index < nums.length - k) {
			  low=index+1;
				 

			} else {
				high=index-1;
			}
		}
		
		return nums[nums.length - k];
	}

	public static int getIndex(int[] nums, int i, int j, int k) {
		int temp = nums[i];
		while (i < j) {
			if (i < j && nums[j] >= temp) {
				j--;
			}
			nums[i] = nums[j];
			if (i < j && nums[i] <= temp) {
				i++;
			}
			nums[j] = nums[i];
			

		}
		nums[i] = temp;
		return i;
	}
}
