package org.swtesting.java;

public class Mathematicalop1 {
	//add 100+20 then from addition -30 output print
	
	public int additionoftwonumber(int s1,int s2) {
		return (s1+s2);
		
	}
	public int subtractionoftwonumber(int s1, int s2) {
		return (s1-s2);
	}
	

	public static void main(String[] args) {
		System.out.println("program start");
		
		Mathematicalop1 obj=new Mathematicalop1();
		int addition =obj.additionoftwonumber(100,20);
		System.out.println("addition="+addition);
		
		int subtraction=obj.subtractionoftwonumber(addition,30);
		System.out.println("subtraction="+subtraction);
		
		System.out.println("program end");
		
	

	}

}
