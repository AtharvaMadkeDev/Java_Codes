package Array_logical_programs;
import java.util.Scanner;
public class Sum_of_columns_of_matrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row, column;
		
		System.out.println("Enter the number of rows :");
		row = scan.nextInt();
		System.out.println("Enter the number of columns :");
		column = scan.nextInt();
		
		int arr [][] = new int [row][column];
		int sum = 0;
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter the "+i+", "+j+" th Element");
				arr[i][j] = scan.nextInt();
			}
			
			System.out.println();
		}
		
		System.out.println("The matrix is : ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		for(int i=0; i<column; i++)
		{
			for(int j=0; j<row; j++)
			{
				sum = sum + arr[j][i];
			}
			
			System.out.println();
			System.out.println("Sum of "+i+" column = "+sum);
			sum = 0;
		}
		
		int sum2=0;
		System.out.println();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				sum2 = sum2+arr[i][j];
			}
			
			System.out.println();
			System.out.println("Sum of "+i+" row = "+sum2);
			sum2=0;
		}
	}

}
