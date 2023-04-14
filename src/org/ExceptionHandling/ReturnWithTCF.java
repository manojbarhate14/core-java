package org.ExceptionHandling;

public class ReturnWithTCF {
	public int test(int i) {
		try {
			if(i==1) {
				return 20;
			}

		}catch(Exception e) {
			System.out.println("exception");
		}finally {
			System.out.println("FINALLY");
		}
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("**program start**");
		ReturnWithTCF obj= new ReturnWithTCF ();
		obj.test(5);
		System.out.println("***program end***");

	}
}
