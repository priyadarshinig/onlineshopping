package Javafiles;
class WageEmployee extends Employee
{
	String type;

	public WageEmployee()
	{
	type="Wage";
	}

	public void display()
	{
	System.out.println("Employee ID:"+empid);
	System.out.println("Employee Name:"+empname);
	System.out.println("Employee Type:"+type);
	}

	public static void main(String arg[])
	{
	WageEmployee obj1=new WageEmployee();

	obj1.display();

	}
}

