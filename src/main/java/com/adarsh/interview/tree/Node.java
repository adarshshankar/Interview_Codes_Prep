package com.adarsh.interview.tree;

public class Node {

	int data;
	Node left;
	Node right;
	int height;

	public Node(int data) {
		this.data = data;
		this.height = 1;
	}
}