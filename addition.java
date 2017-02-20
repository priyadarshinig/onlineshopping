package Javafiles;

public class addition {
		public int add(int v1,int v2)
		{
		return v1+v2;
		}
		public int add(int v1,int v2,int v3)
		{
		return v1+v2+v3;
		}
		public double add(double v1,double v2)
		{
		return v1+v2;
		}
		public void add(int v1,double v2)
		{
			System.out.println(v1+v2);
		}
		public void add(double v1,int v2)
		{
			System.out.println(v1+v2);
		}
		public static void main(String arg[])
		{
			addition obj1=new addition();

			System.out.println("Addition of Two Integer:"+obj1.add(10,20));
			System.out.println("Addition of Three Integer:"+obj1.add(10,20,30));
			System.out.println("Addition of Double Values:"+obj1.add(10.4,20.3));
		}
	}
