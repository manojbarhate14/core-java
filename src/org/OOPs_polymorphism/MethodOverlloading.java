package org.OOPs_polymorphism;

class method{
	int a=10,b=25;
	public void A(int a,int b) {
		int c=a+b;
		System.out.println("method 1="+c);
	}
	public void A(int a,float b) {
		double c=a-b;
		System.out.println("method 2="+c);
	}
	public void A(float a, byte b) {
		double c=a*b;
		System.out.println("method 3="+c);
	}
}
public class MethodOverlloading extends method {

	public static void main(String[] args) {
		MethodOverlloading obj=new MethodOverlloading();
		obj.A(10,25.5f);

	}

}
//In method overloading method name are same but different argument or argument number
//or different data types
//method overloading is a example of compile time polymorphism
