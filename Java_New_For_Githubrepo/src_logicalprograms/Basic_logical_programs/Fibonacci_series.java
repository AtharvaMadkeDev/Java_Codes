package Basic_logical_programs;
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0, n;
		n=scan.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(" "+sum+" ");
		}

	}

}
