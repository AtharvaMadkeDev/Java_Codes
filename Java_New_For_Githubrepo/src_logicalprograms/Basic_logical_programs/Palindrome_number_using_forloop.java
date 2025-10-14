package Basic_logical_programs;
import java.util.Scanner;
public class Palindrome_number_using_forloop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num, d, rev=0;
		
		System.out.println("Please enter any number :");
		num=scan.nextInt();
		
		for(int i=num;i!=0;i=i/10)
		{
			d=i%10;
			rev=rev*10+d;
		}
		System.out.println("Reverse of number = "+rev);
		
		System.out.println();
		System.out.println();
		
		if(rev==num)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}

}
