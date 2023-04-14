package org.swtesting.java;

public class Ex2_globalvariable {
	//global variable
	int a=50,b=100,sum;        
	static int x=20,y=30;     
	
	public static void addition() {        //static block/method
		
	    System.out.println("addition start");
	    Ex2_globalvariable obj=new Ex2_globalvariable();
	    obj.sum =obj.a+obj.b;
	    System.out.println("sum="+obj.sum);
	    
	    obj.sum =Ex2_globalvariable.x+Ex2_globalvariable.y+obj.a+obj.b;
	    System.out.println("total sum="+obj.sum);
	    System.out.println("addition end");
	    System.out.println();
	}
	public void subtraction () {          //non static method/block
		System.out.println("subtraction start");
		int subtration = a-b;
		System.out.println("subtraction="+subtration);
		test();
		System.out.println("subtraction end");
		System.out.println();
	}
	
	public void test()                //if you call non static data from non static block you not need obj directly call them
	{
	    System.out.println("test method it just assume ");
	}

	public static void main(String[] args) {
		System.out.println("**program start**");
		Ex2_globalvariable.addition();
				
		Ex2_globalvariable obj =new Ex2_globalvariable();
		obj.subtraction();
		
		System.out.println("global variable a="+obj.a);
		System.out.println("gobal variable b="+obj.b);
		System.out.println();
		
		System.out.println("global variable x="+Ex2_globalvariable.x);  //if you call static data no need object 
		System.out.println("global variable y="+Ex2_globalvariable.y);  // use directly class name is java standard
		
		System.out.println("**program end**");
		
		

	}

}
