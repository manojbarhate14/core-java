package org.swtesting.java;

public class Ex7_byte {
	public byte by() {
		byte b=45;
		System.out.println("byte="+b);
		
		return b;
		
	}
	

	public static void main(String[] args) {
		System.out.println("program start");
		Ex7_byte obj=new Ex7_byte();
		byte b=obj.by();
				
		System.out.println("byte="+b);
		
		System.out.println("program end");
		

	}

}
