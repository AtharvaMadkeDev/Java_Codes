package Basic_logical_programs;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		
		System.out.println("Enter a year");
		Scanner scan = new Scanner(System.in);
		int year;
		year = scan.nextInt();
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("Year is a leap year");
			
		}
		
		else
		{
			System.out.println("Year is not a leap year");
		}

	}

}
