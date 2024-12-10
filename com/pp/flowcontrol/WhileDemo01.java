package com.pp.flowcontrol;

public class WhileDemo01 {
	public static void main(String[] args) {
		int a = 1;
		int table = 17;
		while (a <= 10) {
			int mult = table * a;
			System.out.println(mult);
			a++;
		}
	}

}
