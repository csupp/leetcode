package csu.common;

import csu.singleList.RemoveLinkedListElement;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
	//	printList(n1);
		RemoveLinkedListElement re = new RemoveLinkedListElement();
		printList(re.removeElements(n1, 4));
		
	}

}
