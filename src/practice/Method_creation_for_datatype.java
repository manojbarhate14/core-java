package practice;

public class Method_creation_for_datatype {
	
	
	public  int addition() {
		int a=10,b=20,sum;
		sum=a+b;
		System.out.println("int sum="+sum);
		return sum;
	}

	public byte by() {
		byte a=127;
		System.out.println("byte="+a);
		return a;
	}
	public short sh() {
		short s=50;
		System.out.println("short="+s);
		return s;
	}
	public long ln() {
		long l=10000,k=20000,sum;
		sum=l+k;
		System.out.println("long sum="+sum);
		return l;
	}
	public char ch() {
		char c=100;
		System.out.println("char="+c);
		return c;
	}
	public float fl() {
		float a=20,b=30,sum;
		sum=a+b;
		System.out.println("float sum="+sum);
		return sum;
	}
	public double db() {
		double a=100,b=100,sum;
		sum=a+b;
		System.out.println("double="+sum);
		return sum;
	}
	public boolean bl() {
		boolean flag=true;
		System.out.println("boolean="+true);
		return true;
	}

	public static void main(String[] args) {
		System.out.println("program start");
		Method_creation_for_datatype obj=new Method_creation_for_datatype();
		//int sum=obj.addition();
		byte a=obj.by();
		short s=obj.sh();
		long l=obj.ln();
		char c=obj.ch();
		//float sum=obj.fl();
		double sum=obj.db();
		boolean flag=obj.bl();

		System.out.println("program end");





	}

}
