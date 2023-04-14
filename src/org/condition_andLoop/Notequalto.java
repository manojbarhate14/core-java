package org.condition_andLoop;

public class Notequalto {
	public void notequal() {
		for (int a=0; a<=10; a++)
			if (a%2 != 0)                // != not equal to
			{
				System.out.println("even number"+a);
			}else
			{
				System.out.println("odd number"+a);
			}
		System.out.println("------------");
	}
	public boolean findevenodd(int i) {
		boolean flag = false;
		if(i%2==0)
		{
			flag=true;

		}
		return flag;

	}

	public static void main(String[] args) {
		Notequalto ref=new Notequalto();
		ref.notequal();
		boolean flag=ref.findevenodd(21);
		if (flag ==true) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}


	}

}
