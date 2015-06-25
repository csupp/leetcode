package csu.breadthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import csu.common.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if(root==null) return list;
		queue.offer(root);
		while(!queue.isEmpty()){
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for(int i=0;i<levelNum;i++){
				if(queue.peek().left !=null){
					queue.offer(queue.peek().left);
				}
				if(queue.peek().right!=null){
					queue.offer(queue.peek().right);
				}
				subList.add(queue.poll().val);
					
			}
			list.add(subList);
		}
		
		
		
		return list;
		
	}

}
