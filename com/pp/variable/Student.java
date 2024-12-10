package com.pp.variable;

public class Student {
	int id;
	String name;
	
	public Student(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  
		Student s[]= {( new Student(101,"Riya")),(new Student(102,"Rahul")),(new Student(103,"Shreya"))};
		
		System.out.println(s[0].id+" "+s[0].name);
		System.out.println(s[1].id+" "+s[1].name);
		System.out.println(s[2].id+" "+s[2].name);
			
      }
}
