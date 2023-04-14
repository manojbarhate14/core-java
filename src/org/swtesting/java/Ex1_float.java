package org.swtesting.java;

public class Ex1_float {
	//create different method use of all eight datypes 
	
	public float addition1() 
	{
		float a=10f,b=20f,sum;
		
		sum=a+b	;	
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println("program start");
		
		Ex1_float obj=new Ex1_float();
		float f=obj.addition1();		
		System.out.println("foat="+f);
		
		System.out.println("program end");
	}

	}
