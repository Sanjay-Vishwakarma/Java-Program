package com;



class MainP
{
      class Inner_Class
      {
		void inn_meth() {
			System.out.println("Method of inner class");
		}
	}
	void clas_meth() {
		Inner_Class in=new Inner_Class();
		in.inn_meth();
	}
	
}



// driver

public class InnerClass_27 {
public static void main(String[] args) {
	MainP obj = new MainP();

	obj.clas_meth();
}
}
