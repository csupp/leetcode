package csu.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import csu.common.TreeNode;

/**
 * Leetcode 144 二叉树的前序遍历
 * 
 * @author ricky
 *
 */
public class PreOrderTranversal {

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
		System.out.println(preOrderTraversal(r1));
	}

	/**
	 * 递归实现前序遍历
	 * 
	 * @param root
	 * @return
	 */
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}
		if (root != null) {

			res.add(root.val);
			res.addAll(preorderTraversal(root.left));
			res.addAll(preorderTraversal(root.right));

		}

		return res;

	}

	/**
	 * 迭代实现前序遍历
	 * 
	 * @param root
	 * @return
	 */
	public static List<Integer> preOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		List<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode curNode = s.pop();
			res.add(curNode.val);
			if (curNode.right != null) {
				s.push(curNode.right);
			}
			if (curNode.left != null) {
				s.push(curNode.left);
			}

		}
		return res;
	}
}
