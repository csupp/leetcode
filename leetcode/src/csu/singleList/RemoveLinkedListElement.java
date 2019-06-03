package csu.singleList;

import java.util.LinkedList;
import java.util.Stack;

import csu.common.ListNode;


public class RemoveLinkedListElement {
  public ListNode removeElements(ListNode head, int val){
	  Stack st = new Stack();
	  Stack st2 = new Stack();
	   while(head!=null){
		  if(head.val!=val){
			  st.push(head);
			}
		  head = head.next;
		}
	   ListNode node  = new ListNode(val);
	while(!st.isEmpty()){
		st2.push(st.pop());
	}
	while(!st2.isEmpty()){
		node.next = (ListNode) st2.pop();
	}
	
	
	
	  
	  
	  
	return node;
	  
  }
}
