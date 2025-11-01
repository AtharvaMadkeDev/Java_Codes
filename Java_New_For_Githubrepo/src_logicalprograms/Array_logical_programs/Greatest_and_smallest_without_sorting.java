package Array_logical_programs;
import java.util.Scanner;
public class Greatest_and_smallest_without_sorting {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter any 5 integers");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		int greater=arr[0];
		int smaller=arr[0];
		
		
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j]>greater)
			{
				greater=arr[j];
			}
			
			if(arr[j]<smaller)
			{
				 smaller=arr[j];
			}
		}
		
		
		
		System.out.println("Greater number = "+greater);
		System.out.println("Smaller number = "+smaller);
		
		scan.close();
	}

}
