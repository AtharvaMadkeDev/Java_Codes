package Basic_logical_programs;
import java.util.*;
public class greatest_among_three {

	public static void main(String[] args) {
		
		System.out.println("Enter any 3 numbers");
		
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		//1 no
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("A is greater");
		}
		
		if(num2>num1 && num2>num3)
		{
			System.out.println("B is greater");
		}
		
		if(num3>num1 && num3>num2)
		{
			System.out.println("C is greater");
		}
		
		//2 nos
		
		if(num1==num2 && num1>num3)
		{
			System.out.println("A and B are greater");
		}
		
		if(num1==num3 && num1>num2)
		{
			System.out.println("A and C are greater");
		}
		
		if(num2==num3 && num2>num1)
		{
			System.out.println("B and C are greater");
		}
		
		
		//3 nos
		
		if(num1==num2 && num2==num3)
		{
			System.out.println("All are equal");
		}
	}

}
