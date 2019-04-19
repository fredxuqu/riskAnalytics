package com.himalaya.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

//	private volatile int count = 0;
	
	private volatile AtomicInteger count = new AtomicInteger(0);
	
//	public synchronized void increment() {
//		count++;
//	}
	
	public void increment() {
		count.incrementAndGet();
	}
	
	private int getCount() {
		return count.get();
	}
	
	public static void main(String[] args) throws Exception {
		
		final ThreadTest counter = new ThreadTest();
		int workCount = 50000;
		ExecutorService es = Executors.newFixedThreadPool(10);
		long start = System.currentTimeMillis();
		for (int i=0; i<workCount; i++) {
			Runnable task = new Runnable() {

				@Override
				public void run() {
					counter.increment();
				}
			};
			es.execute(task);
		}
		
		es.shutdown();
		es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		System.out.println("Cost " + (System.currentTimeMillis() - start));
		System.out.println("Count = " + counter.getCount());
	}
}
