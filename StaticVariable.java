package Javafiles;
public class StaticVariable {
	    int var1=5;
		static int var2=2;

		public StaticVariable() //Constructor
		{
		var1++;
		var2++;	
		}
		
		public static void main(String arg[])
		{
		StaticVariable ob1=new StaticVariable();
		System.out.println(ob1.var1);
		System.out.println(ob1.var2);
		
		StaticVariable ob2=new StaticVariable();
		System.out.println(ob2.var1);
		System.out.println(ob2.var2);		

		}
	}
