package csu.common;

import csu.singleList.RemoveLinkedListElement;

public class Node {
	public int val;
	public Node next;

	public Node(int x) {
		val = x;
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.println(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
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
