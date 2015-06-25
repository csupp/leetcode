package csu.singleList;

import java.util.LinkedList;
import java.util.Stack;

import csu.common.Node;

public class RemoveLinkedListElement {
  public Node removeElements(Node head, int val){
	  Stack st = new Stack();
	  Stack st2 = new Stack();
	   while(head!=null){
		  if(head.val!=val){
			  st.push(head);
			}
		  head = head.next;
		}
	Node node  = new Node(val);
	while(!st.isEmpty()){
		st2.push(st.pop());
	}
	while(!st2.isEmpty()){
		node.next = (Node) st2.pop();
	}
	
	
	
	  
	  
	  
	return node;
	  
  }
}
