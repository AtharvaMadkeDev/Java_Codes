package Loops;

public class For_each_Loop {

	public static void main(String[] args) {
		
		/**
		 * Syntax :
		 * 
		 * for(datatype var : arrayorcollection)
		 * 	{
		 * 	System.out.println(var);
		 * 	}
		 */
		
		int [] arr = {1,2,3,4,5};
		
		for(int num : arr)
		{
			System.out.println(num);
		}

	}

}
