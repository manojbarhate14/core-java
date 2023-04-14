package org.OOPs_Encapsulation;

class Getsetmethod{
	private int  aaccnum=101021,a,b,c;
	public void setA(int a) {  //setter method
		this.a=a;
	}
	public int getA() {      //getter method
		return a;
	}
	public void setB(int b) {
		this.b=b;
	}
	public int getB() {
		return b;
	}
	public void setC(int c) {
		this.c=c;
	}
	public int getC() {
		return c;
	}
	public int getaccnum() {
		System.out.println("A/C no  = "+aaccnum);
		return aaccnum;
	}
	public int setaccnum(int accnum) {
		System.out.println("A/C no  = "+aaccnum);
		return aaccnum;
	}
}
public class GetSet {
	public static void main(String[] args) {
		Getsetmethod obj = new Getsetmethod();
		obj.getaccnum();
		obj.setA(10);
		obj.setB(20);
		obj.setC(30);
		obj.setaccnum(10234534);
		System.out.println("a= "+obj.getA());
		System.out.println("b= "+obj.getB());
		System.out.println("c= "+obj.getC());
		System.out.println(10552);
		
	}
}
