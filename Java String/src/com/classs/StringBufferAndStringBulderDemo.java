package com.classs;

public class StringBufferAndStringBulderDemo {

	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		int i ;
//		StringBuffer
		
		StringBuffer sb = new StringBuffer("java");
		for( i=0; i<10000; i++)
		{
			sb.append("Tpoint");
		}
		System.out.println("The StringBuffer time taken is: "+(System.currentTimeMillis()-startTime)+"ms");
		
		
//		StringBuilder 
		startTime = System.currentTimeMillis();
		StringBuilder sb2 =  new StringBuilder("Java");
		for( i=0;i<10000; i++)
		{
			sb2.append("Tpoint");
		}
		
		System.out.println("The StringBuilder time taken is: "+(System.currentTimeMillis()-startTime)+"ms");

		
	}
	
	
}
