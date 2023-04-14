package org.SinglandmultiTurn;

class Parent2{
	static Parent2 obj=null;
	static int count=1;
	private Parent2() {
		count++;
	}
	public static Parent2 getPObject(){
		if(count<=3) {
			obj = new Parent2();
			
		}
		return obj;
	}
}

public class MaxThreeObj {

	public static void main(String[] args) 
	{
		Parent2 obj1 =Parent2.getPObject();
		Parent2 obj2 =Parent2.getPObject();
		Parent2 obj3 =Parent2.getPObject();

	}

}
