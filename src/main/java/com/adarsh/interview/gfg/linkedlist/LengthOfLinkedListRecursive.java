package com.adarsh.interview.gfg.linkedlist;

public class LengthOfLinkedListRecursive {
	static int count = 0;

	public static void main(String[] args) {
		Entity root = DefaultLinkedList.getDefaultLinkedList();
		int result = LengthOfLinkedListRecursive.findLengthUsingRecursive(root);
		System.out.println("Total Number of element = " + result);
	}

	public static int findLengthUsingRecursive(Entity root) {

		return getLength(root);
	}

	private static int getLength(Entity entity) {
		if (entity != null) {
			count++;
			getLength(entity.next);
		}
		return count;
	}

	public static int findLengthUsingIterative(Entity root) {
		count = 0;
		Entity start=root;
		while (start != null) {
			count++;
			start = start.next;
		}
		return count;
	}

}
