package Basic_logical_programs;
import java.util.Scanner;
public class LCM_GCD {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num1, num2, lcm, gcd=1;
		
		System.out.println("Enter your first number = ");
		num1=scan.nextInt();
		System.out.println("Enter your second number = ");
		num2=scan.nextInt();

		int small;
		
			if(num1<num2)
			{
				small=num1;
			}
			
			else
			{
				small=num2;
			}
			
			for(int i=small;i>=1;i--)
			{
				if(num1%i==0 && num2%i==0)
				{
					gcd=i;
					break;
				}
			}
			
			System.out.println("GCD = "+gcd);
			
			lcm=(num1*num2)/gcd;
			
			System.out.println("LCM = "+lcm);
			
			scan.close();
	}

}
