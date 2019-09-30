package com.adarsh.interview.exception;

public class SubClass implements Super {
	public static void main(String[] args) {
		Super sc = new SubClass();
		try {
			sc.test1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void test1() throws Exception {
		try {
			throw new Exception();
		} catch (NullPointerException ex) {
			System.out.println("StackOverflowError");
		}
	}

	public void test2() {
		try {
			throw new StackOverflowError();
		} catch (Throwable e) {
			System.out.println("StackOverflowError");
			test2();
		}
	}

}
