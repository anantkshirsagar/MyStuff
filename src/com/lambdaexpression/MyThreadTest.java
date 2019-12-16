package com.lambdaexpression;

public class MyThreadTest {
	public static void main(String[] args) throws Exception {
		//----------------------------------------------------
		//Using anonymous class implementation
		//----------------------------------------------------
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+" - Do some task here!");
				}
			}
		});
		t1.start();
		
		//----------------------------------------------------
		//Using lambda expressions
		//----------------------------------------------------
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 10; ++i) {
				System.out.println(Thread.currentThread().getName()+" - Do some task here!");
			}
		});
		t2.start();
	}
}
