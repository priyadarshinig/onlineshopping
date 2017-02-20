package Javafiles;

import java.util.Scanner;

public class methoddemo {
	int var1,var2,var3,var4;
		public int add()
		{
			System.out.println("enter the numbers");
			Scanner scan=new Scanner(System.in);
			var1=scan.nextInt();
			Scanner scan1=new Scanner(System.in);
			var2=scan1.nextInt();
			return var1+var2;
			
		}
		public int sub() {
			System.out.println("enter the number");
			Scanner scan3=new Scanner(System.in);
			var3=scan3.nextInt();
			Scanner scan4=new Scanner(System.in);
			var4=scan4.nextInt();
			return var3-var4;
			
		}
		public static void main(String arg[])
		{

		methoddemo obj1=new methoddemo();

		 int ret_val=obj1.add(); //Calling 
        int ret_val1=obj1.sub();
		System.out.println("The Return Value:"+ret_val);
		System.out.println("the return value:"+ret_val1);
		}
	}

