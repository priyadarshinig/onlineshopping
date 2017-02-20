package Javafiles;
public class Boxoverload {
		double width,height,depth;
		
		public Boxoverload()	//Default Box
		{
		width=10.0;
		height=15.0;
		depth=20.0;
		}

		public Boxoverload(double val)	//Square Box
		{
		width=height=depth=(val>0)?val:1;
		}

		public Boxoverload(double w,double h,double d)	//User Defined Box
		{
		width=(w>0)?w:1; //if w>0 then w will assign to width else 1 will assign to width
		height=(h>0)?h:1;
		depth=(d>0)?d:1;
		}

		public double volume()
		{
		return width*height*depth;
		}

		public static void main(String arg[])
		{
		Boxoverload ob1=new Boxoverload();
		
		Boxoverload ob2=new Boxoverload(10);

		Boxoverload ob3=new Boxoverload(11,12,13);

		System.out.println("Volume of the Default Box:"+ob1.volume());
		System.out.println("Volume of the Square Box:"+ob2.volume());
		System.out.println("Volume of the UserDefined Box:"+ob3.volume());

		}
	}
