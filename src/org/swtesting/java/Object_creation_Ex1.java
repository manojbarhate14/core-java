package org.swtesting.java;

public class Object_creation_Ex1 {
	int b=50;   //global variable

	public static void main(String[] args) {
		System.out.println("program start");
		int a=20;
		
		System.out.println("a=" +a);
		//syntax for creating object ;
		//cass name =new class name ()
		
		Object_creation_Ex1 obj1 =new Object_creation_Ex1();
		
		System.out.println("b =" +obj1.b);
		System.out.println("program end");
				
	}
	}
