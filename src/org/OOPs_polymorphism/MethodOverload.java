package org.OOPs_polymorphism;

class AA{
	public void addition(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public void addition(int a, int b, int c) {
		int sum=a-b;
		System.out.println(sum);
		
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		AA metthod= new AA();
		metthod.addition(10, 20,10);

	}

}
