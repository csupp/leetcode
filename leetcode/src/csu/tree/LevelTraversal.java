package csu.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import csu.common.TreeNode;

/**
 * 迭代实现二叉树的层序遍历
 * 
 * @author ricky
 *
 */

public class LevelTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.out.println(levelTraversal(r1));
	}

	public static List<Integer> levelTraversal(TreeNode root) {

		List<Integer> res = new ArrayList<Integer>();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null) {
			return res;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode curNode = queue.removeFirst();

			res.add(curNode.val);
			if (curNode.left != null) {
				queue.add(curNode.left);
			}
			if (curNode.right != null) {
				queue.add(curNode.right);
			}

		}

		return res;

	}

}
