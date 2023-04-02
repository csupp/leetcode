package csu.singleList;

import csu.common.ListNode;

public class ReverseSingleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		ListNode n =n1;
		while(n!=null){
			System.out.print(n.val+">");
			n= n.next;
		}

		System.out.println("");

       ListNode r = reverseSingleList(n1);
       while(r!=null){
			System.out.print(r.val+">");
			r= r.next;
		}


	}

	/**
	 * 迭代的方法反转链表 时间复杂度O(n),空间复杂度O(1)
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode pre = null;
		ListNode temp = null;
		while (head != null) {
			temp = head;
			head = head.next;
			temp.next = pre;
			pre = temp;
		}
		return pre;
	}

	public static ListNode revList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode pre = null;
		ListNode temp = null;
		while(head!=null){
			temp = head;
			head= head.next;
			temp.next=pre;
			pre=temp;
		}
		return pre;
	}



	public static ListNode reverseList1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = reverseList1(head.next);
		head.next.next = head;
		head.next = null;
		return head;
	}

	public static ListNode reverseSingleList(ListNode head){
		if(head==null || head.next==null){
			return head;
		}
		ListNode pre = null;
		ListNode temp= null;
		while(head!=null){
			temp=head;
			head = head.next;
			temp.next=pre;
			pre=temp;

		}

		return pre;
	}

}
