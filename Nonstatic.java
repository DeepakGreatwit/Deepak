package StaticDemo;

public class Nonstatic {
	public static void main(String[] args) {
		  int n = 5;
	       System.out.println("Main method");
	       System.out.println(n);
	       Nonstatic ce = new Nonstatic();
		ce.m1();
	}
	{
		System.out.println("non static block");
	}
	void m1()
	{
		System.out.println("non static method ");
	}

}
