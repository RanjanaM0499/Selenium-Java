package beginselenium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		try {
			int number=sc.nextInt();
			int a=number%0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.err.println("Divisible by zero not possible");
			
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input must be number");
		}
		catch(Exception e)
		{
			System.out.println("Completed");
		}
		finally {
			sc.close();
		}
		
		

	}

}
