package Arrays;

public class Jagged_Array {

	public static void main(String[] args) {
		
		int [][] arr = new int [3][];		// new int [3][] ==> i.e number of rows fixed and number of columns are not fixed
		
		
		
		arr[0] = new int [3];		//declaring number of columns for the specific row
		arr[1] = new int [4];		//declaring number of columns for the specific row
		arr[2] = new int [2];		//declaring number of columns for the specific row
		
		arr[0][0]=1;
		arr[1][0]=2;
		arr[2][0]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[1][3]=7;
		
		arr[2][0]=8;
		arr[2][1]=9;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
