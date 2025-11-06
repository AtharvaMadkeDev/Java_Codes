package Basic_logical_programs;
import java.util.Scanner;
public class Armstrong_number_raw_using_forloop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num, sum=0, d, counter ;
		
		System.out.println("Please Enter a number : ");
		
		num=scan.nextInt();
		
		int temp=num;
		
		counter=0;
		
		for(int j=temp;j!=0;j=j/10)
		{
			counter++;
		}
		
		
		for(int i=temp;i!=0;i=i/10)
		{
			d=i%10;

				int remaining=1;
				for(int z=1;z<=counter;z++) 
				{
					
					remaining=remaining*d;  
				
				}
			
				
				sum=sum+remaining;
				
		}
		
		System.out.println("Number of digits = "+counter);
		System.out.println("Sum of digits = " +sum);

		
		if(sum==num)
		{
			System.out.println("It is an Armstrong number");
		}
		
		else
		{
			System.out.println("It is not an Armstrong number");

		}
		
		scan.close();
	}

}
