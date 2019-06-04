package csu.common;

import csu.breadthFirstSearch.BinaryTreeLevelOrderTraversal;

public class TreeNode {
   public int val;
   public TreeNode left;
   public TreeNode right;
   public TreeNode(int x){
	   val = x ;
   }
   
   public static void main(String[] args) {
	   TreeNode r1 = new TreeNode(1); 
	   TreeNode r2 = new TreeNode(2); 
	   TreeNode r3 = new TreeNode(3); 
	   TreeNode r4 = new TreeNode(4); 
	   TreeNode r5 = new TreeNode(5); 
	   TreeNode r6 = new TreeNode(6); 
	   r1.left = r2;
	   r1.right = r3;
	   r2.left = r4;
	   r2.right = r5;
	   r3.right = r6;
	   
	   
	   BinaryTreeLevelOrderTraversal bt = new BinaryTreeLevelOrderTraversal();
	   for(int i=0;i< bt.levelOrder(r1).size();i++){
		   System.out.println(bt.levelOrder(r1).get(i));
	   }
	  ;
}
}
