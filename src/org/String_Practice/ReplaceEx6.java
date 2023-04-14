package org.String_Practice;

public class ReplaceEx6 {

	public static void main(String[] args) {
		String str="there is garden and which is attractive";
		
//		String str1 =str.replace('i', 'A');
//		System.out.println("after replace i with A: \n"+str1);
		
//		String str1=str.replaceAll("is", "you");
//		System.out.println("after replace is with you: \n"+str1);
		
		String str1=str.replaceFirst("is", "was");
		System.out.println("after replace first key is with was: \n"+str1);
		

	}

}
