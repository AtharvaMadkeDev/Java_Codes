package Basic_logical_programs;
import java.util.Scanner;
public class Armstrong_number_raw_using_whileloop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, d, counter, sum=0;
		
		System.out.println("Please enter your number :");
		num=scan.nextInt();
		int temp=num;
		
		counter=0;
		
		int temp_1=temp;
		while(temp_1!=0)
		{
			
			temp_1=temp_1/10;
			counter++;
		}
		
		System.out.println("Number of digits : "+counter);
		
		while(temp!=0)
		{
			d=temp%10;
			

			int result=1;
			for(int i=1;i<=counter;i++)
			{
				result=result*d;
			}
			
			sum=sum+result;
			temp=temp/10;
			
		}

		System.out.println("Sum of digits : "+sum);
		
		if(sum==num)
		{
			System.out.println("It is an Armstrong Number");
		}
		
		else
		{
			System.out.println("It is not an Armstrong Number");
		}
	}

}
