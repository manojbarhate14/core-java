package org.Break_Continue;

public class ForLoopContinue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++ ) {
			if(i==5 || i==8) {     //pipe'|'
				continue;
			}
			System.out.println("i= "+i);
		}
		
	}

}


