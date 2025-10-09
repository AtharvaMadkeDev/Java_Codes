package Basic_logical_programs;
import java.util.*;
public class Calculator_using_switch {

	public static void main(String[] args) {
		
		int i;
		double num1,num2,result;
		System.out.println("Enter any two numbers");
		
		Scanner scan = new Scanner(System.in);
		
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		
		System.out.println("Please select your choice!!");
		
		System.out.println("1) Enter '1' for addition");
		System.out.println("2) Enter '2' for subtraction");
		System.out.println("3) Enter '3' for multiplication");
		System.out.println("4) Enter '4' for division");
		
		
		i=scan.nextInt();
		
		switch (i)
		{
		case 1:
			
			System.out.println("Addition");
			result=num1+num2;
			System.out.println(result);
			break;
			
		case 2:
			System.out.println("Subtraction");
			result=num1-num2;
			System.out.println(result);
			break;
			
		case 3:
			System.out.println("Multiplication");
			result=num1*num2;
			System.out.println(result);
			break;
			
		case 4:
			System.out.println("Division");
			result=num1/num2;
			System.out.println("Quotient = "+result);
			result=num1%num2;
			System.out.println("Remainder = "+result);
			break;
			
		default:
			System.out.println("Please enter a correct choice");
		}
		
		
	}

}
