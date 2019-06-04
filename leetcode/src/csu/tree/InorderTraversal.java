package csu.tree;
/**
 * Leetcode 94
 * @author ricky
 *
 */

import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

import csu.common.TreeNode;

public class InorderTraversal {

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
		System.out.println(inOrderTraversal(r1));

	}

	/**
	 * 递归实现中序遍历
	 * 
	 * @param root
	 * @return
	 */
	public static ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		if (root == null) {
			return res;
		}
		if (root != null) {
			res.addAll(inorderTraversal(root.left));
			res.add(root.val);
			res.addAll(inorderTraversal(root.right));
		}

		return res;

	}

	/**
	 * 迭代实现中序遍历
	 * 
	 * @param root
	 * @return
	 */
	public static ArrayList<Integer> inOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		TreeNode cur = root;
		while (true) {
			while (cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			if (s.isEmpty()) {
				break;
			}
			cur = s.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		return res;

	}

}
