package com.adarsh.interview.sorting;

public class OddEvenSort {
	public static void oddEvenSort(int arr[], int n) {
		boolean isSorted = false; // Initially array is unsorted

		while (!isSorted) {
			isSorted = true;
			// Perform Bubble sort on odd indexed element
			for (int i = 1; i <= n - 2; i = i + 2) {
				if (arr[i] > arr[i + 1]) {
					isSorted = SwapData(arr, i);
				}
			}

			// Perform Bubble sort on even indexed element
			for (int i = 0; i <= n - 2; i = i + 2) {
				if (arr[i] > arr[i + 1]) {
					isSorted = SwapData(arr, i);
				}
			}
		}

		return;
	}

	private static boolean SwapData(int[] arr, int i) {
		boolean isSorted;
		int temp;
		temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
		isSorted = false;
		return isSorted;
	}

	public static void main(String[] args) {
		int arr[] = { 34, 2, 10, -9 };
		int n = arr.length;

		oddEvenSort(arr, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println(" ");
	}
}
