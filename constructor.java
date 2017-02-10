package Javafiles;

public class constructor {
	     int id;  
	    String name;  
	      
	    constructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display()
	    {System.out.println(id+" "+name);
	    }  
	    
	    public static void main(String args[]){  
	    constructor s1 = new constructor(111,"priya");  
	    constructor s2 = new constructor(222,"darshini");  
	    s1.display();  
	    s2.display();  
	   } 
}