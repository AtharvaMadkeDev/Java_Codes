package Basic_logical_programs;
import java.util.Scanner;
public class Perfect_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, sum=0;
		
		System.out.println("Please enter a number : ");
		num=scan.nextInt();
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("Number is Perfect!");
		}
		else
		{
			System.out.println("Number is NOT Perfect");
		}
	}

}
