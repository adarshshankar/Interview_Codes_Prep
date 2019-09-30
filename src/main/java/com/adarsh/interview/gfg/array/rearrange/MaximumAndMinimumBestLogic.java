package com.adarsh.interview.gfg.array.rearrange;

/**
 * In this post a solution that requires O(n) time and O(1) extra space is
 * discussed. The idea is to use multiplication and modular trick to store two
 * elements at an index.
 * 
 * @author kmamani
 *
 */
public class MaximumAndMinimumBestLogic {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		rearrange(arr, arr.length);

		System.out.print("\nModified Array\n");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	// Prints max at first position, min at second position
	// second max at third position, second min at fourth
	// position and so on.
	static void rearrange(int[] arr, int n) {
		// initialize index of first minimum and first
		// maximum element
		int max_idx = arr.length - 1;
		int min_idx = 0;

		// store maximum element of array
		int max_elem = arr[arr.length - 1] + 1;

		// traverse array elements
		for (int i = 0; i < n; i++) {
			// at even index : we have to put
			// maximum elemlent
			if (i % 2 == 0) {
				arr[i] += (arr[max_idx] % max_elem) * max_elem;
				max_idx--;
			}

			// at odd index : we have to put minimum element
			else {
				arr[i] += (arr[min_idx] % max_elem) * max_elem;
				min_idx++;
			}
		}
		// array elements back to it's original form
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] / max_elem;
	}
}
