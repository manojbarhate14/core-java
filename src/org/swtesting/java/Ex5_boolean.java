package org.swtesting.java;

public class Ex5_boolean {
	//Creates different method use of all eight dataypes
	public boolean ans()
	{
		boolean que=true;
		return que;
	}
	

	public static void main(String[] args) {
		System.out.println("program start");
		Ex5_boolean obj=new Ex5_boolean();
		boolean que=obj.ans();
		
		System.out.println("que="+que);
		System.out.println("program end");
		
	}

}
