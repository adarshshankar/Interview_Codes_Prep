package com.adarsh.interview.gfg.basics;

import java.util.Arrays;

public class SpiralMatrix2 {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		System.out.println(Arrays.toString(arr));
		System.out.println("Entered Matrix");
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(i + "," + j + "\t");
			}
			System.out.println("\n");
		}
	}
}
