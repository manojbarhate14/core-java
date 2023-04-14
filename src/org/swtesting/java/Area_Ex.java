package org.swtesting.java;

public class Area_Ex {

	public float areaofcircle(float r) {
		float cr=3.14f*(r*r);                 //area of circle=>pie*r sq.
		System.out.println("area of circle="+cr);
		return cr;
	}

	public float areaoftriangle(float x,float y) {
		float z=(x*y)/2;                        //area of triangle=>(H*B)/2
		System.out.println("area of triangle="+z);
		return z;
	}
	public int areaofsquare(int s) {
		int sq=s*s;                          //area of square=> side*side
		System.out.println("area of square="+sq);
		return sq;
	}
	public static void main(String[] args) {
		System.out.println("program start");

		Area_Ex obj=new Area_Ex();
		obj.areaofcircle(10);
		obj.areaoftriangle(7,5);
		obj.areaofsquare(25);

		System.out.println("program end");


	}

}
