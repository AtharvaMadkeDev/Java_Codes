package Basic_logical_programs;
import java.util.Scanner;
public class Sum_of_first_n_natural_nos {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int no;
		int sum=0;
		
		System.out.println("Please enter a number :");
		
		no=scan.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of 'n' Natural numbers = "+sum);
	}

}
