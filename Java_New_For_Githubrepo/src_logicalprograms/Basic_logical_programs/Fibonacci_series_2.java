package Basic_logical_programs;
import java.util.Scanner;
public class Fibonacci_series_2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int first, second, next, n;
		
		n=scan.nextInt();
		
		first=0;
		second=1;
		
		System.out.print("Fibonacci series = "+first+", "+second);
		
		int i=2;
		while(i<=n)
		{
			next=first+second;
			System.out.print(", "+next);
			
			first=second;
			second=next;
			
			i++;
		}

	}

}
