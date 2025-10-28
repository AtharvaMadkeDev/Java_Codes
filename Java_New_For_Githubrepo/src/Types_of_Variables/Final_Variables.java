package Types_of_Variables;

public class Final_Variables {

	public static void main(String[] args) {
		
		final int age = 23;  //fixed value using final keyword
		
		int age1=age+1;
		//age++;  //gives an compile time error
		//age=age+1;	//gives an compile time error
		
		
		System.out.println("Age after 1 year : "+age1);
		System.out.println("Current age : "+age);
		
	}

}
