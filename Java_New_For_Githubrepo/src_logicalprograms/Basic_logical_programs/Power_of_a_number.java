package Basic_logical_programs;
import java.util.Scanner;
public class Power_of_a_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, power, result;
		
		
		System.out.println("Please enter a number : ");
		num=scan.nextInt();
		
		System.out.println("Please enter the power");
		power=scan.nextInt();
		

		result=1;
		for(int i=1;i<=power;i++)
		{
			result=result*num;
			
		}
		
		System.out.println("Answer : "+result);
		
		scan.close();
	}

}
