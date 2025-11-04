package Array_logical_programs;
import java.util.Scanner;
public class Sum_of_Matrix_3_x_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] arr = new int [3][3];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.println("Enter the "+i+", "+j+" th Element");
				arr[i][j] = scan.nextInt();
			}
		System.out.println();
		System.out.println();
		}
		
		System.out.println("The 3x3 matrix is :");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
		System.out.println();
		}
		
		System.out.println();
		System.out.println("Sum of the matrix = "+sum);
		scan.close();
		
	}

}
