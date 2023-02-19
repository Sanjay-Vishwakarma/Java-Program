package com.exception.handling;

public class ExceptionPropogation {

	void m() {
		int a = 20 / 0;

	}

	void n() {
		m();
	}

	void p() {

		try {

			n();

		} catch (Exception e) {
			System.out.println("Exception handled " +e);
		}
	}

	public static void main(String[] args) {

		ExceptionPropogation ep = new ExceptionPropogation();
		ep.p();

	}

}
