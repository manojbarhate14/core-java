package practice;

import java.util.Scanner;

public class Loop_pract {

	int i,j,k;
	Scanner scn =new Scanner(System.in);
	int a= scn.nextInt();
	public void loop() {
		for(i=a; i<=10; i++) {
			
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("enter your number");
		Loop_pract obj=new Loop_pract();
		obj.loop();

	}

}
