package csu.array;

import java.util.HashMap;

/**
 * Leecode 287 寻找重复数
 * 
 * 假设数组中没有重复，那我们可以做到这么一点，就是将数组的下标和1到n每一个数一对一的映射起来。比如数组是213,则映射关系为0->2, 1->1,
 * 2->3。假设这个一对一映射关系是一个函数f(n)，其中n是下标，f(n)是映射到的数。如果我们从下标为0出发，根据这个函数计算出一个值，以这个值为新的下标，再用这个函数计算，以此类推，直到下标超界。实际上可以产生一个类似链表一样的序列。比如在这个例子中有两个下标的序列，0->2->3。
 * 
 * 但如果有重复的话，这中间就会产生多对一的映射，比如数组2131,则映射关系为0->2, {1，3}->1,
 * 2->3。这样，我们推演的序列就一定会有环路了，这里下标的序列是0->2->3->1->1->1->1->...，而环的起点就是重复的数。
 * 
 * 所以该题实际上就是找环路起点的题。过程是这样的：我们先用快慢两个下标都从0开始，快下标每轮映射两次，慢下标每轮映射一次，直到两个下标再次相同。这时候保持慢下标位置不变，再用一个新的下标从0开始，这两个下标都继续每轮映射一次，当这两个下标相遇时，就是环的起点，也就是重复的数。
 *
 * @author ricky
 *
 */
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 3, 4, 2, 2 };
	//	System.out.println(findDuplicate(nums));
		System.out.println(findDuplicat2(nums));
	}

	public static int findDuplicate2(int[] nums){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int a: nums){
			if(map.containsKey(a)){
				map.put(a,map.get(a)+1);
				return a;
			}else{
				map.put(a,1);
			}
		}

		return -1;

	}

	public static int findDuplicat2(int [] nums){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int a: nums){
			if(map.containsKey(a)){
				return a;
			}else{
				map.put(a,1);
			}
		}
		return -1;
	}

	public static int findDuplicate(int[] nums) {
		int length = nums.length;
		if (length > 1) {
			// 找到快慢指针相遇的地方
			int slow = nums[0];
			int fast = nums[nums[0]];
			while (fast != slow) {
				slow = nums[slow];
				fast = nums[nums[fast]];
			}

			// 用一个新指针从头开始，直到和慢指针相遇
			fast = 0;
			while (fast != slow) {
				slow = nums[slow];
				fast = nums[fast];
			}
			return slow;
		}
		return -1;
	}

}
