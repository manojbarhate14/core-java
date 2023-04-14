package org.swtesting.java;

public class Ex3_int {
	//creat method by uding various datatypes & uses of return type 

	public int addition()
	{
		int a=10,b=20,sum;
		sum= a+b;
		
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("program start");
		Ex3_int obj=new Ex3_int ();
		int i=obj.addition();
		System.out.println("i="+i);
		
		System.out.println("program end");
		//return    //by default hidden 
	}

}
  //for void not required return type because void means nthg in this case return type is by default 
  //any other datatype required return 