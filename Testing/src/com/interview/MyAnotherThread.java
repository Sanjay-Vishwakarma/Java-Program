package com.interview;

public class MyAnotherThread extends Thread{
	
	public void run()
	{
		for(int i=10;i>=0;i--)
		{
			try {
				System.out.println("My Second Thread :" +i);

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
	}
	

}
