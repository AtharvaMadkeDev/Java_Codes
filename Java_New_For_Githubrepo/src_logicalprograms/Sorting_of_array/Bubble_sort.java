package Sorting_of_array;

public class Bubble_sort {

	public static void main(String[] args) {
		
		int temp = 0;
		int arr[] = {12,1,25,4,4,7,8,3,20};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println("sorted : "+arr[j]);
				}
			}
		}
		
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
