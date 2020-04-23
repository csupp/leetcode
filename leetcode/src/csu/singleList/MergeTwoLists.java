package csu.singleList;

import csu.common.ListNode;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode mergeTwoList(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode resList;
		if (l1.val < l2.val) {
			resList = l1;
			l1=l1.next;
			resList.next=null;
		} else {
			resList = l2;
			l2=l2.next;
			resList.next=null;
		}
		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				resList.next = l1.next;
				l1 = l1.next;
				resList.next.next=null;
			} else {
				resList.next = l2.next;
				l2 = l2.next;
				resList.next.next=null;
			}

		}

		if (l1.next == null && l2.next != null) {
			resList.next = l2.next;
			l2 = l2.next;
		}
		if (l1.next != null && l2.next == null) {
			resList.next = l1.next;
			l1 = l1.next;
		}

		return resList;
	}
}
