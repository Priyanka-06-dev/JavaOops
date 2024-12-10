package com.pp.array;

public class CharArrayDemo2 {
public static void main(String[]args) {
		
		char[] ch= new char[5];
		
		ch[0]='a';
		ch[1]='e';
		ch[2]='i';
		ch[3]='o';
		ch[4]='u';
		
	    
	    System.out.println("to print whole value by -- advance for each");  
        for(char x:ch) {
            System.out.println(x);
        }
      
        System.out.println("to print ascii value");
        for(int x:ch) {
            System.out.println(x);
        }
        
      System.out.println("----for loop-----");
        for(int i=0;i<ch.length; i++) {
            
            System.out.println(ch[i]);
        }
        
        System.out.println("------While loop-------");
    
        int j=0;
        while(j<ch.length) {
            System.out.println(ch[j]);
            j++;
        }

   }


		
	}




