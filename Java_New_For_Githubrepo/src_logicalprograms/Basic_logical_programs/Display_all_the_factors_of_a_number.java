package Basic_logical_programs;
import java.util.Scanner;
public class Display_all_the_factors_of_a_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Please enter a number : ");
		num=scan.nextInt();
		
		System.out.println("Factor : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
