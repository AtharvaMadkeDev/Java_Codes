package Basic_logical_programs;
import java.util.Scanner;
public class Reverse_of_number {

	public static void main(String[] args) {
		
		int no, d, rev=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		no=scan.nextInt();
		
		for(int i=no;i!=0;i=i/10)
		{
			d=i%10;
			rev=rev*10+d;
		}
		
		System.out.println("Reverse = "+rev);
		
	}
	
}
