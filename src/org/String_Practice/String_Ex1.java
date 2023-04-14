package org.String_Practice;

public class String_Ex1 {

	public static void main(String[] args) {
		//1st way to write string
		String str ="there is garden and which is attractive";
		//2nd way to write string
		String str1= new String("my name is manoj");
		
		int length=str.length();
		System.out.println("length of string = "+length);
		
		System.out.println("char at 1st position :"+str.charAt(0));
		System.out.println("all string seperated");
		for (int i=0; i<length; i++) 
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("index of t="+str.indexOf('t'));
		System.out.println("index of t="+str.indexOf('T'));
		System.out.println("Last index of t ="+str.lastIndexOf('t'));
		
		
	}
}
//indexOf()=>show only first appearance string
//lastIndexOf()=>shows last string 
