package org.lambdaExpression;

interface if3{
	public int lengthofstring(String str);
	
}
interface if2{
	public int addition (int a, int b);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		if3 obj= (str)-> str.length();
		if2 obj1= (x,y) ->{
			return x+y;
		};
		int length = obj.lengthofstring("there is garden");
		System.out.println("length of string ="+length);
		int sum =obj1.addition(10, 30);
		System.out.println("addition ="+sum);

	}

}
