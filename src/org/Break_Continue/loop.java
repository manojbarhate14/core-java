package org.Break_Continue;

public class loop {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++ ) {
			if(i==6) {
				break;
			}
			System.out.println("i= "+i);
		}
		System.out.println("*************");
		int i=51;
		while(i<=60) {
			if(i==54) {
				break;	
			}
			System.out.println("i = "+i);
			i++;

		}

	}
}
