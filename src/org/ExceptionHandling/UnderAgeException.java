package org.ExceptionHandling;

import practice.Constructor;

public class UnderAgeException extends Exception {
	
	//parameterized constructor
	
	UnderAgeException(){
		super("You are undetr age");
	}
	UnderAgeException(String message){
		super(message);
	}
}

class Voting{
	public static void main(String[] args) throws UnderAgeException {
		int age =17;
		if(age<18)
		{
			throw new UnderAgeException("you canot vote");
		}
		else {
			System.out.println("you can vote ....");
		
	}
	
	}
}
	