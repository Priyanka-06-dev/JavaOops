package com.pp.operators;

public class ShortCirOpeDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		if(++a>10 || ++b<15) {
			
			++a;
		}else {
			
			++b;
		}
		
		System.out.println(a+"   "+b);

	}

}
