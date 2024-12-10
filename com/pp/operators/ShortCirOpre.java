package com.pp.operators;

public class ShortCirOpre {

	public static void main(String[] args) {
		
		int x = 12;
		int y = 20;
		if(++x>14 && ++y<20) {
			
			++x;
		}else {
			
			++y;
		}
		
		System.out.println(x+"  "+y);
		

	}

}
