package StaticDemo;

public class StaticEx {

   static int a=6;
	public static void main(String[] args) {
		
       System.out.println("Main method ");
         System.out.println(StaticEx.a);
    StaticEx.m1();
       
	}
     static void m1()
     {
    	 System.out.println("Inside  method ");
     }
    static{
    	
    	 System.out.println("this is  static block");
    	 System.out.println("this is  static block");
    	 StaticEx.m1();
    }
   
}
