package com.interview;

public class EqualsCheck {
	
	public static void main(String[] args) {
		
		
		/*
		 * String s1 ="Sanjay"; String s2 = "Sanjay"; String s3 = new String ("Sanjay");
		 * StringBuffer sb = new StringBuffer("sanjay");
		 * 
		 * System.out.println(s1==s2); System.out.println(s2==s3);
		 * System.out.println(s1.equals(s3)); // contain check
		 * System.out.println(s3.equals(sb));
		 */
		
		String str="Sanjay" , nstr="";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr);
	}

}
