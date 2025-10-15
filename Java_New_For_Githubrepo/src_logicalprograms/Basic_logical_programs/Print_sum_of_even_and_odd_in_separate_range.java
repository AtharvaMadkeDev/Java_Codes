package Basic_logical_programs;
import java.util.Scanner;
public class Print_sum_of_even_and_odd_in_separate_range {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum_even=0;
		int sum_odd=0;
		
		System.out.println("Please enter a number : ");
		int num=sc.nextInt();
		
		System.out.println("Even numbers : ");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum_even=sum_even+i;
			}
		}
		System.out.println("Sum of even numbers till the given range : "+sum_even);	
		System.out.println();
		
		System.out.println("Odd numbers : ");
		for(int j=1;j<=num;j++)
		{
			if(j%2!=0)
			{
				System.out.println(j);
				sum_odd=sum_odd+j;
			}
		}
		System.out.println("Sum of odd numbers till the given range : "+sum_odd);		
		
		sc.close();
	}

}
