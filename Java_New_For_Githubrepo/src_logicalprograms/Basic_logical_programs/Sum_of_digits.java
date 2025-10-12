package Basic_logical_programs;
import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter a number : ");
		
		int num, sum=0, d;
		
		num=scan.nextInt();
		
		for(int i=num;i!=0;i=i/10)
		{
			d=i%10;
			sum=sum+d;
		}
			
		System.out.println("Sum of digits = "+sum);
	}

}
