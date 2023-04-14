package org.SinglandmultiTurn;

class Parent1{
	static Parent1 obj= null;
	private Parent1() {

	}
	public static Parent1 getPObject() {
		if(obj==null) {
			obj= new Parent1();
		}
		return obj;

	}
}

public class SingleTonEx {

	public static void main(String[] args) {
		Parent1 obj = Parent1.getPObject();   //same memory
		Parent1 obj1= Parent1.getPObject();   //same memory



	}

}
