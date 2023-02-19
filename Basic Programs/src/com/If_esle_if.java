package com;

import java.util.*;

public class If_esle_if {
	public static void main(String args[]) {
		int amount = Integer.parseInt(args[0]);
		// int amount = 1000;
		if (amount >= 1000) {
			amount = amount - 200;

		} else if (amount >= 500) {
			amount = amount - 100;

		} else if (amount >= 100) {
			amount = amount - 50;
		}
		System.out.println("no discount");
		System.out.println("Bill pay after discount " + amount);
	}
}
