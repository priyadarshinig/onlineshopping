package Javafiles;

public class Rectangle extends Shape
{
	public Rectangle(double d1,double d2)
	{
		super(d1,d2); //Calling the Shape class Constructor
	}
	
	//Now here we have overridden the area() method from Shape Class 
	public double area()
	{
		return dim1*dim2;
	}

}
