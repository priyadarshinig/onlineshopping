import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact,var1,factorial=1;
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		fact=scan.nextInt();
		for(var1=1;var1<=fact;var1++)
		{
			factorial=factorial*var1;
		}

		System.out.println("Factorial of Given Number:"+fact+" is "+factorial);
		
	}

}
