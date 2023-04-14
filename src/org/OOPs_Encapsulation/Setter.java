package org.OOPs_Encapsulation;

class Set_Value{
	private int empid;
	
	public void setID(int ID) {
		empid=ID;
	}
	public int getID() {
		return empid;
	}
}

public class Setter {

	public static void main(String[] args) {
		Set_Value obj=new Set_Value();
		obj.setID(105);
		System.out.println(+obj.getID());

	}

}
