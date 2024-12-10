package com.pp.flowcontrol;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 15; // number of terms
		int a = 0;
		int b = 1;

		System.out.println("Fibonacci Series: ");
		for (int i = 1; i <= n; i++) {
			// int sum = a + b;
			// a = b;
			// b = sum;
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;

		}
	}
}
