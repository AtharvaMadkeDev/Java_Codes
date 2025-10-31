package Array_logical_programs;
import java.util.Scanner;
public class Greatest_and_smallest_in_array_using_sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any 5 integers");
		int temp=0;
		
		int arr[] = new int [5];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int z=0; z<arr.length; z++)
		{
			for(int j=0; j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Smallest no = "+arr[0]);
		System.out.println("Greatest no = "+arr[arr.length-1]);

		sc.close();
	}

}
