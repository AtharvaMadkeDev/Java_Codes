package Array_logical_programs;
import java.util.Scanner;


public class Marks_of_students_in_different_class {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int marks[][] = new int[3][];
		
		marks[0] = new int [3];
		marks[1] = new int [5];
		marks[2] = new int [2];
		
		for(int i=0; i<marks.length; i++)
		{
			for(int j=0; j<marks[i].length; j++)
			{
				System.out.println("Enter the "+i+", "+j+" th element :");
				marks[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("The Marks are :");
		for(int i=0; i<marks.length; i++)
		{
			for(int j=0; j<marks[i].length; j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i=0; i<marks.length; i++)
		{
			for(int j=0; j<marks[i].length; j++)
			{
				sum = sum + marks[i][j];
			}
			
			System.out.println("Sum of the marks of "+i+" th row = "+sum);
			sum=0;
		}
		System.out.println();
	}

}
