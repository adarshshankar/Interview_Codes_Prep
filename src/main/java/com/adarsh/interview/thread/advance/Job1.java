package com.adarsh.interview.thread.advance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Job1 implements Runnable {
	public int product = 0;
	private CyclicBarrier barrier;

	public Job1(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	public void run() {
		product = 2 * 3;
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public int getResult() {
		return product;
	}
}