package org.lambdaExpression;

interface if1{
	public int addition (int a, int b);
	public int lengthofstring(String str);

}

public class LambdaEx1 implements if1 {
	public int addition(int a, int b) {

		return a+b;
	}

	public int lengthofstring(String str) {
		//	str = "manoj barhate";		
		return str.length();
	}

	public static void main(String[] args) {
		LambdaEx1 obj =new LambdaEx1();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.lengthofstring("manoj barhate"));

		//		if1 i= new if1() {
		//
		//			public int addition(int a, int b) {
		//				
		//				return a+b;
		//			}
		//
		//			public int lengthofstring(String str) {
		//				str = "manoj barhate";		
		//				return str.length();
		//			}
		//		
		//		};
		//		System.out.println("sum ="+i.addition(10, 20));
		//	}

	}
}
