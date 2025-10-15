package Basic_logical_programs;
import java.util.Scanner;
public class Prime_number_identification {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean isPrime=true;
		System.out.println("Please enter a number : ");
		num=scan.nextInt();
		
		if(num<=1)
		{
			System.out.println("Number is neither prime, nor composite");
		}
		
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
			
			if(isPrime==true)
			{
				System.out.println("It is a Prime number");
			}
			
			else
			{
				System.out.println("It is not a Prime number");
			}
		}
			
		scan.close();
	}

}
