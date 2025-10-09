package Basic_logical_programs;
import java.util.Scanner;
public class Positive_or_negative {

	public static void main(String[] args) {
		
		
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int no= scan.nextInt();
		
		if(no>0)
		{
			System.out.println("Positive");
			
		}
		
		else if(no<0)
		{
			System.out.println("Negative");
		}
		
		else
		{
			System.out.println("Zero");
		}
	}

}
