package Basic_logical_programs;
import java.util.Scanner;
public class Print_table {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number :");
		int num=scan.nextInt();
		
		System.out.println("Table of "+num+": ");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}

}
