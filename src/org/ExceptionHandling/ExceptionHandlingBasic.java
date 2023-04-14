package org.ExceptionHandling;

public class ExceptionHandlingBasic {
	
	public int Exception(int a, int b) {
		System.out.println("***Division Start***");
		int div=0;
		try {
			div =a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Division= "+div);
		return div;
	}

	public static void main(String[] args) {
		System.out.println("Program start");
		ExceptionHandlingBasic obj =new ExceptionHandlingBasic();
		obj.Exception(10,0);
		
		System.out.println("***Program End***");
		

	}

}
