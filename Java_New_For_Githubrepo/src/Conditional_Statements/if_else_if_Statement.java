package Conditional_Statements;

public class if_else_if_Statement {

	public static void main(String[] args) {
		
		/**
		 * Syntax :
		 * 
		 * if(condition_1)
		 * {
		 * 		code to be executed if condition_1 is true
		 * }
		 * 
		 * else if(condition_2)
		 * {
		 * 		code to be executed if condition_2 is true
		 * }
		 * 
		 * else if(condition_3)
		 * {
		 * 		code to be executed if condition_3 is true
		 * }
		 * 
		 * else
		 * {
		 * 		code to be executed if every above condition is false
		 * }
		 */
			
		int marks = 90;
		
		if(marks>=90)
		{
			System.out.println("A Grade");
		}
		
		else if(marks>=70)
		{
			System.out.println("B Grade");
		}
		
		else if(marks>=50)
		{
			System.out.println("C Grade");
		}
		
		else
		{
			System.out.println("Failed");
		}
		
		
		
		
		
	}

}
