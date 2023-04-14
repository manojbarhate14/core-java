package org.ExceptionHandling;

public class ThrowEx1 {

	public void test1() throws InterruptedException {
		System.out.println("test1 start ");
		Thread.sleep(3000);// 3000 millisec = 3sec.
		System.out.println("test2 end");
	}
	public void test2(int a, int b) {
		//
		if(b!=0) {
			int div =a/b;
		}else {
			System.out.println("please enter value od b is >0");
			// throw new ArithmeticException ("divide by 0");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		ThrowEx1 obj =new ThrowEx1();
		obj.test1();
		obj.test2(10, 0);

	}
}
// we have three way for handling exception 
// 1st is use try catch block
//2nd is use if-else loop
//3rd is use throws keyword