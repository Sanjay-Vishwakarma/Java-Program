package com;

public class Final_keword_23 {

	int speed = 23;  //final speed=23 it can not be run

	void run() {
		speed = 40;

	}

	public static void main(String[] args) {
		Final_keword_23 kk = new Final_keword_23();
		kk.run();
	}
}
