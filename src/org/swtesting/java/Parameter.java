package org.swtesting.java;

public class Parameter {
	
	public int addition(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("program start");
		
		Parameter obj=new Parameter();
		int sum=obj.addition(50,100);  //argument pass
		System.out.println("sum="+sum);
		
		sum=obj.addition(45,65);
		System.out.println("sum="+sum);
		
		sum=obj.addition(65,35);
		System.out.println("sum="+sum);
		
		System.out.println("program end");
		
		
		
		
		

	}

}
