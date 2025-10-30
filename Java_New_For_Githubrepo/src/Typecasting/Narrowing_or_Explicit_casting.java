package Typecasting;

public class Narrowing_or_Explicit_casting {

	public static void main(String[] args) {
		
		double d = 9.78;
		int num = (int) d;				//double to integer conversion(Manually done by a programmer)
		System.out.println(num);		//Output => 9
	}

}

//Their are chances of data loss in Explicit casting