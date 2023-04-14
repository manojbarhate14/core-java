package org.ExceptionHandling;

public class ExepHand_String {
	public void String() {
		String str ="my name is manoj";
		System.out.println("length of string= "+str.length());
		try {	
			int a=str.charAt(18);
			System.out.println("char ="+a);
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExepHand_String obj =new  ExepHand_String();
		obj.String();
	}

}
