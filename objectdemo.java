package Javafiles;

public class objectdemo {
	int width,height,depth;
	
	public static void main(String arg[])
	{
    
	objectdemo obj=new objectdemo();

	//Initialization
	obj.width=10;
	obj.height=15;
	obj.depth=20;
	
	//Displaying
	System.out.println("Width of Box:"+obj.width);
	System.out.println("Height of Box:"+obj.height);
	System.out.println("Depth of Box:"+obj.depth);

	//Manipulation with Object Member
	double volume=obj.width*obj.height*obj.depth;

	System.out.println("Volume of the Box:"+volume);

	}
}

