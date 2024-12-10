package com.pp.operators;

public class ConcateStringDemo {

	public static void main(String[] args) {
		int a=12;
		int b=10;
		int c=5;
		String d= "Priya";
		System.out.println(a+d+c+b);//12priya510
		System.out.println(d+a+c+b);//priya12510
		System.out.println(a+c+b+d);//27priya(if we add int value before string value addition every int value are added)
		System.out.println(a+b+d+c);
		 
	}
}
