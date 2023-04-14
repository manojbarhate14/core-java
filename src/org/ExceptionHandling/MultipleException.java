package org.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleException 
{
	public void multipleexception(int a, int b)
	{
		try {
			System.out.println("inside try block");
			int div=a/b;
			System.out.println("Division= "+div);

			int ar[]=new int[3];
			ar[5] = 50;
			System.out.println("After code in  try");
			
			FileInputStream fis =new FileInputStream("\"C:\\Users\\Akshay Joshi\\Desktop\\New Text Document.txt\"");
			System.out.println(fis.read());
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("inside Arithmetic Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("inside Array Index Out Of Bounds Exception");	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("inside file not found exception");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("inside IOException");
		}
	}
	public static void main(String[] args) {
		MultipleException obj =new MultipleException();
		obj.multipleexception(10, 0);
	}
}
