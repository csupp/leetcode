package csu.singleList;

import csu.common.ListNode;

public class GetIntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode getIntersecListNode(ListNode head1, ListNode head2) {

		if (head1 == null || head2 == null) {
			return null;
		}

		int len1 = 1, len2 = 1;

		ListNode tail1 = head1;
		ListNode tail2 = head2;
		while (tail1.next != null) {
			tail1 = tail1.next;
			len1++;
		}
		while (tail2.next != null) {
			tail2 = tail2.next;
			len2++;
		}

		if (tail1 != tail2) {
			return null;
		}

		ListNode head_a = head1;
		ListNode head_b = head2;

		if (len1 > len2) {
			int k = len1 - len2;
			while (k != 0) {
				head_a = head_a.next;
				k--;
			}
		} else {
			int k = len2 - len1;
			while (k != 0) {
				head_b = head_b.next;
				k--;
			}
		}

		while (head_a != head_b) {
			head_a = head_a.next;
			head_b = head_b.next;
		}

		return head_a;
	}

}
