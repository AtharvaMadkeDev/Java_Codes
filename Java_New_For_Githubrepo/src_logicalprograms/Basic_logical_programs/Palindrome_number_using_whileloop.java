package Basic_logical_programs;
import java.util.Scanner;
public class Palindrome_number_using_whileloop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num, d, rev=0;
		
		System.out.println("Please enter a number");
		num=scan.nextInt();
		
		int temp=num;
		while(temp!=0)
		{
			d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		System.out.println("Reverse of number = "+rev);
		
		System.out.println();
		System.out.println();
		
		if(num==rev)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
		
		scan.close();
	}

}
