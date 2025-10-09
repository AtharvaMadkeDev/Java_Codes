package Basic_logical_programs;
import java.util.*;
public class Divisible_by_5_or_11 {

	public static void main(String[] args) {
		
		System.out.println("Enter any number ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if(num%5==0 && num%11==0)
		{
			System.out.print("Number is divisible by 5 and 11");
		}
		
		else
		{
			System.out.println("Number is not divisible by 5 and 11");
		}
	}

}
