package Constructors_in_Java;

public class This_keyword_in_constructors_2 {

	public static void main(String[] args) {
		
		
		//Syntax for jumping from constructor to constructor
		
		ThisKeyword tk = new ThisKeyword(1, "Atharva");
		

	}

}

class ThisKeyword
{
	int id;
	String name;
	
	public ThisKeyword()
	{
		System.out.println("From the constructor with no parameters");
	}
	
	public ThisKeyword(int id, String name)
	{
		this();			//Jumping to the constructor with no parameters.
		this.id=id;
		this.name=name;
		
		System.out.println("From the constructor with parameters");
	}
}