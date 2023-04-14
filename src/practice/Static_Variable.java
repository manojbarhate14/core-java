package practice;

public class Static_Variable {
	
	int a,b;
	static int  c =35;
	
	public static  int addition(int a,int b) {
	    int d=5;
		int sum=a+b+d+c;
		System.out.println("sum="+sum);
		return sum;
	}
	public void Add() {
		int sum=a+b+c;
		System.out.println("add method "+sum);
	}
	public static void main(String []arg) {
		
		int s=Static_Variable.addition(5,10);//for call static method you not need create object
		System.out.println(s);
		
		Static_Variable obj=new Static_Variable();
		obj.Add();
	}//for call non static method you need create object
}
//static variable or method can not create multiple copy
