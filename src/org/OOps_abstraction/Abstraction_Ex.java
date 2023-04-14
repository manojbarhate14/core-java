package org.OOps_abstraction;

abstract class animal{
	animal(){
		System.out.println("all animal....");
	}
	public abstract void sound();
}
class dog extends animal{

	public void sound(){
		System.out.println("dog is barking");
	}

}
class lion extends animal{

	public void sound() {
		System.out.println("lion is roar");
	}

}
public class Abstraction_Ex  {

	public static void main(String[] args) {
		dog d=new dog();
		lion l=new lion();
		d.sound();
		l.sound();
	}

}
//super. =>to call global variable of same class
//super() =>to call constructor of same class

