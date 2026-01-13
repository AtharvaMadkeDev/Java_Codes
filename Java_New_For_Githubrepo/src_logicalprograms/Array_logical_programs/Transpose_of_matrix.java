package Array_logical_programs;

public class Transpose_of_matrix {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		int counter=0;
		int temp = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = counter;
				counter++;
			}
		}
		
		System.out.println("Original array : ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of array : ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
