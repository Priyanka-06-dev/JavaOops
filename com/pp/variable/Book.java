package com.pp.variable;

public class Book {
	
	String name;
	String	author;
	String	type;
	String publisher;
	int pages;
	
	
	
	public Book(String name,String author,String type,String publisher,int pages) {
		
		this.name=name;
		this.author=author;
		this.type=type;
		this.publisher=publisher;
		this.pages=pages;
		
}
	     public static void main(String args[]) {
	    	 
	    	 Book b1= new Book("Mindset,","DR Carol S.Dweck,","Non fiction,","the Random House,",304);
	    	Book b2= new Book("Do Epic Shit,","Ankur Warikoo,","Non fiction,","Juggernaut Publication,",312);
	    	Book b3=new Book("Atomic Habits,","James Clear,","Non fiction,","Avery Publishing,",320);
	    	
	    	
	    	System.out.println(b1.name+b1.author+b1.type+b1.publisher+b1.pages);
	    	System.out.println(b2.name+b2.author+b2.type+b2.publisher+b2.pages);
	    	System.out.println(b3.name+b3.author+b3.type+b3.publisher+b3.pages);
	    	 
	    	 
	    	 
	 } 
	
	
	
	

}
