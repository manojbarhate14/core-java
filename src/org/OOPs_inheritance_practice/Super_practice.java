package org.OOPs_inheritance_practice;

import org.constructor_Practice.This_practice;

public class Super_practice extends This_practice{
	//Super_practice() constructor is hidden
	public Super_practice(){
		super(100,25.3f);

	}

	public static void main(String[] args) {
		System.out.println("progarm start");
		Super_practice obj=new Super_practice();
		System.out.println("progarm end");

	}

}
