package Typecasting;

public class Widening_or_Implicit_casting {

	public static void main(String[] args) {
		
		int num = 10;			
		double d = num;			//integer to double conversion(Java does it automatically)
		System.out.println(d);		//Output => 10.0
	}

}

//No data loss occurs in Implicit casting