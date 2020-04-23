package csu.singleList;

import csu.common.ListNode;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void deleteNode(ListNode node) {
		
     node.val = node.next.val;
     node.next=node.next.next;
	}
}
