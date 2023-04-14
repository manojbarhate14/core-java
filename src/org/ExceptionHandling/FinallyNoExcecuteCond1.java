package org.ExceptionHandling;

public class FinallyNoExcecuteCond1 {

	public static void main(String[] args) {
		System.out.println("**program start**");
		try {
			System.out.println("inside try block");
			int div=10/0;
			System.out.println("div ="+div);
		}catch(ArithmeticException e) {
			System.out.println(e);

		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.exit(0); //finally block not execute 1st condition
			System.out.println("inside finally");
			System.out.println("1");
			System.out.println("2");
		}
		System.out.println("program end");

	}

}
//not execute finally block in three condition
//first is =>System.exit()=>is use for exit from program
//2nd is=>Exception occur in finally block
//3rd is => Death of thread