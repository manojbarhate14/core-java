package org.condition_andLoop;

public class Char_AtoZ {

	public void charprint() {
		System.out.println("Capital Letter");
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}System.out.println();
		System.out.println();
	}
	public void smalletter() {
		System.out.println("Small Letter");
		for(char i='a'; i<='z'; i++) {
			System.out.print(i+" ");
		}System.out.println();
		System.out.println();
	}
	public void asscii() {
		System.out.println("Capital letter from ASCCI code");
		for(int i=65; i<=90; i++) {
			System.out.print((char) i);
		}System.out.println();
		System.out.println();
	}
	public void ascci1() {
		System.out.println("Small letter forn ASCCI code");
		for (int i=97; i<=122; i++) {
			System.out.print((char) i);		
		}
	}
	public static void main(String[] args) {
		Char_AtoZ obj=new Char_AtoZ();
		obj.charprint();
		obj.smalletter();
		obj.asscii();
		obj.ascci1();
	}
}
