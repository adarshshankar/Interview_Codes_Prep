package com.adarsh.interview.thread;

public class Thread1 extends Thread {
	public WaitNotify s1;

	public Thread1(WaitNotify s1) {
		this.s1 = s1;
	}
	public void run(){
		s1.test1();
	}

}
