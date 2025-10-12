package Basic_logical_programs;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number : ");
		Scanner scan = new Scanner(System.in);
		int no, factorial=1;
		
		no=scan.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial = "+factorial);
	}

}
