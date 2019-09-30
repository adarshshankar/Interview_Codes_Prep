package com.adarsh.interview.tree;

import java.util.Stack;

public class LevelOrderSpiralTraversal {

	public static void main(String[] args) {
		BSTNode root = BSTDefaultTree2.getDefaultTree();
		LevelOrderSpiralTraversal levelOrderTraversal = new LevelOrderSpiralTraversal();
		levelOrderTraversal.spiralTree(root);
	}

	void spiralTree(BSTNode root) {
		Stack<BSTNode> s1 = new Stack<BSTNode>();
		Stack<BSTNode> s2 = new Stack<BSTNode>();
		s1.add(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				BSTNode p = s1.pop();
				System.out.print(p.data + "\t");
				if (p.left != null) {
					s2.push(p.left);
				}
				if (p.right != null) {
					s2.push(p.right);
				}
			}
			while (!s2.isEmpty()) {
				BSTNode p = s2.pop();
				System.out.print(p.data + "\t");
				if (p.right != null) {
					s1.push(p.right);
				}
				if (p.left != null) {
					s1.push(p.left);
				}
			}
		}
	}
}
