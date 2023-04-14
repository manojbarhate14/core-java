package org.scanner_switchcase;

import java.util.Scanner;

public class Switch_case_ex1 {

	public static void main(String[] args) {
		
		Switch_case_ex1 obj=new Switch_case_ex1();
		obj.switchcaseformonth();	
	}
	public void switchcaseformonth() {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter Month Number");
		int a=scn.nextInt();
		System.out.println("your Enter month number is ");
	
		switch (a){
		case 1:System.out.println("January");
		break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5: System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("Octomber");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;     
		//not mandatory but it will continue after this statement
		default :System.out.println("Invalid month number");
		}
	}
}
