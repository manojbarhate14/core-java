package org.condition_andLoop;

public class Whileloop_ex1 {

	public static void main(String[] args) {
		Whileloop_ex1 obj=new Whileloop_ex1();
		obj.whileloop();
		System.out.println("-------------------");
		obj.whiledoloop();
	}

	public void whileloop() {
		int a=0;                       //Initialize
		while(a<11) {                  //condition
			System.out.println(a);
			a++;                       //increment/decrement
		}
		System.out.println("-----------------");
		System.out.println("value of a="+a );
	}
	public void whiledoloop() {
		int i=15;
		do {                          //in ' do ' execute loop at least once 
			
			System.out.println("inside do="+i);
		}while (i <12); 
	}
}

