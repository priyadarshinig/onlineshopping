import java.util.*;

public class Employee extends sampleDate {
	String empname;
	String empdept;
	String empdesg;
	int empjoindate,empjoinmonth,empjoinyear;
	int dobdate,dobmonth,dobyear;
	public void employee_details() {
		System.out.println("enter the employee name:");
		Scanner scan = new Scanner(System.in);
		empname = scan.next();
		int empid, dateofmarriage;
		boolean isMarried = false;
		System.out.println("enter the employee id:");
		empid = scan.nextInt();
		System.out.println("the employee id is" + empid);
		System.out.println("enter the marital status");
		isMarried = scan.nextBoolean();

		if (isMarried != false) {
			System.out.println("enter the date of marriage");
			sampleDate obj = new sampleDate();
			obj.maariageDate();		
			/*
			 * System.out.println("enter the date of marriage");
			 * 
			 * System.out.println("enter the day"); int day=scan.nextInt();
			 * System.out.println("enter the month"); int month=scan.nextInt();
			 * System.out.println("enter the year"); int year=scan.nextInt();
			 * System.out.println("the date of marriage is:"
			 * +day+"/"+month+"/"+year);
			 */
			}
		else if (isMarried == true) 
		{
			System.out.println("exit");
		}
        
		System.out.println("enter the employee department:");
		empdept=scan.next();
		System.out.println("enter the designation:");
		empdesg=scan.next();
		System.out.println("enter the date of joining");
		empjoindate=scan.nextInt();
		empjoinmonth=scan.nextInt();
		empjoinyear=scan.nextInt();
		System.out.println("enter the date of birth");
		dobdate=scan.nextInt();
		dobmonth=scan.nextInt();
		dobyear=scan.nextInt();
	}
	public void view_details()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("the employee name is  :"+empname);
		System.out.println("the employee dept is  :"+empdept);
	    System.out.println("the employee designation is  :"+empdesg);
	    System.out.println("the join date of the employee is  :"+ empjoindate+"/"+empjoinmonth+"/"+empjoinyear);
	    System.out.println("the date of birth of the employee is  :"+dobdate+"/"+dobmonth+"/"+dobyear);
	}
	public static void main(String args[]){
		
		        Employee emp=new Employee();	
		        Scanner scan= new Scanner(System.in);
		        System.out.println("1\t enter details");
		        System.out.println("2\t view details");
		        System.out.println("3\t exit");
		        System.out.println("Please enter your choice:");
		        int choice=scan.nextInt();
		        switch (choice) {
		            case 1: emp.employee_details();
		                    emp.view_details(); 
			   break;
		            case 2: emp.view_details();
		                    break;
		            case 3: System.out.println("exited"); 
		            
		
       
	}
	}
	}
