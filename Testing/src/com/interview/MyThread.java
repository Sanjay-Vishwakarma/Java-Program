package com.interview;

public class MyThread implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			
			
			try {
				System.out.println("MyFirst Thread :" + i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

	public static void main(String[] args) {
		MyThread thr = new MyThread();
		Thread th = new Thread(thr);
		
//		 second thread
		MyAnotherThread secthr = new MyAnotherThread();
		secthr.start();
		th.start();

	}

}
