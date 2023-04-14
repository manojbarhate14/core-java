package org.String_Practice;

public class EqualsMethodEx7 {

	public static void main(String[] args) {
		String str1 ="Manoj";
		String str2 ="Manoj";
		String str3 =new String("Manoj");
		String str4 ="Manoj";
		String str6 =str2;
		
		System.out.println("equal method: "+str1.contentEquals(str2));
		System.out.println("==operator: "+str1==str3);
		
//		System.out.println(str1.contentEquals(str2));
//		System.out.println(str3.contentEquals(str4));
//		System.out.println(str6.contentEquals(str2));
	}
}
// ***In comparing***
//contentEqual()=> compare your data
//"=="  => this operator compare there memory