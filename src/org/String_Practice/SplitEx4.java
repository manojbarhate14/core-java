package org.String_Practice;

public class SplitEx4 {

	public static void main(String[] args) {
		String str="My name is Manoj Patil";
		String str1="manoj best";

		String[] ar=str.split(" ");

		System.out.println("length of ar ="+ar.length);
		//	System.out.println("case= "+ar[2]);

		System.out.println("after splitting name seperatly: \n");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}System.out.println();
		System.out.println(str);
	}

}
