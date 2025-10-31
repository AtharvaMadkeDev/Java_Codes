package Arrays;

public class One_Dimensional_Arrray {

	public static void main(String[] args) {
		
		//Array is a collection of same datatypes, stored in contiguous memory.
		
		int arr [] = new int [5];		//declaration of array
		
		/**
		 * Array can be declared in many ways such as :
		 * datatype array_name [] = new datatype [array_length];  ===>  eg. int arr[] = new arr[10];
		 * datatype array_name [] = { value1, value2, value3, value4, value5};   ==> eg. int arr[] = {1,2,3,4,5};
		 */
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("Array : ");
		for(int i=0; i<arr.length; i++)		
		{
		System.out.println(arr[i]);
		}

	}

}
