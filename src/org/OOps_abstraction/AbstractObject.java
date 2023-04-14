package org.OOps_abstraction;

abstract class ABC{
	abstract public int test();
	
	public void subtraction() 
	{
		System.out.println("subtraction");
	}
	
}
// way of create object for abstract class
public class AbstractObject {

	public static void main(String[] args) {
		ABC obj=new ABC() {
			public int test() {
				
				return 0;
			}
			
		};
		
	}	
}
