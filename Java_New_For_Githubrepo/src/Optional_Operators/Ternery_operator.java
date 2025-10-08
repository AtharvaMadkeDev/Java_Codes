package Optional_Operators;

public class Ternery_operator {

	public static void main(String[] args) {
		
		/**
		 * Syntax :
		 * 
		 * variable = (condition) ? value_if_true : value_if_false;
		 */
		
		int age = 20;
		
		String result = (age>=18) ? "Adult" : "Under-age";
		System.out.println(result);

	}

}
