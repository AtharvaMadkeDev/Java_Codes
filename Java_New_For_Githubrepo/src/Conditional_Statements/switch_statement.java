package Conditional_Statements;

public class switch_statement {

	public static void main(String[] args) {
		
		/**
		 * Syntax :
		 * 
		 * switch(variable)
		 * {
		 * 		case value1
		 * 		//code
		 * 		break;
		 * 
		 * 		case value2
		 * 		//code
		 * 		break;
		 * 
		 * 		case value3
		 * 		//code
		 * 		break;
		 * 
		 * 		default:
		 * 		//code if none matched
		 * }
		 */
		
		
		int day=3;
		switch(day)
		{
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
			System.out.println("Tuesday");
			break;
			
			case 3:
			System.out.println("Wednesday");
			break;
			
			case 4:
			System.out.println("Tuesday");
			break;
				
			case 5:
			System.out.println("Tuesday");
			break;
				
			case 6:
			System.out.println("Tuesday");
			break;
				
			case 7:
			System.out.println("Tuesday");
			break;
			
			default:
			System.out.println("Invalid day");
		}

	}

}
