package org.ExceptionHandling;

public class ExepHand_Null {
	public void Null() {
		String str=null;
		System.out.println("length of string ="+str);
		try {
			int a= str.charAt(0);
			System.out.println(a);
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExepHand_Null obj =new ExepHand_Null();
		obj.Null();


	}

}
