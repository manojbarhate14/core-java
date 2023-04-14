package org.swtesting.java;
//Incomplete program complete after narrowing topic

public class Short_addition {
	public void addition(short s1, short s2) {
		short sum= (short)(s1 + s2);
		System.out.println("addition="+sum);

	   
	}

	public static void main(String[] args) {
		System.out.println("program start");
		Short_addition obj=new Short_addition();
		obj.addition((short)10,(short)20);
		System.out.println("program end");
		//by default java consider all number are int
	
		

	}

}
