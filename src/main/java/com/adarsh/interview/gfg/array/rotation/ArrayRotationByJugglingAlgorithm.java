package com.adarsh.interview.gfg.array.rotation;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/array-rotation/
 * 
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * Array Rotation of the above array by 2 will make array ArrayRotation1
 * 
 * 
 */
public class ArrayRotationByJugglingAlgorithm {
	public static void main(String[] args) {
		ArrayRotationByJugglingAlgorithm rotate = new ArrayRotationByJugglingAlgorithm();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	}

	/* function to print an array */
	void printArray(int arr[], int size) {
		System.out.println(Arrays.toString(arr));
	}

	/* Fuction to get gcd of a and b */
	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	/* Function to left rotate arr[] of siz n by d */
	void leftRotate(int arr[], int d, int n) {
		int i, j, k, temp;
		int gcd = gcd(d, n);
		for (i = 0; i < gcd; i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}
}
