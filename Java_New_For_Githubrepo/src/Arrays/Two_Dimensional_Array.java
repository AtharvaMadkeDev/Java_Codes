package Arrays;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		
		int arr [][] = new int [3][3];		//[3][3] are number of rows and number of columns respectively
		
		/**
		 * Can also be written as : 
		 * int arr [][] = {
		 * {10,20,30},
		 * {40,50,60},
		 * {70,80,90}
		 * };
		 * 
		 */
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		for(int i=0; i<arr.length; i++)		//outer loop for rows
		{
			for(int j=0; j<arr[i].length; j++)		//inner loop for columns
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
