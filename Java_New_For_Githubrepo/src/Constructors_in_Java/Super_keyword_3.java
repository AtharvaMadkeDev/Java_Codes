package Constructors_in_Java;

public class Super_keyword_3 {

	public static void main(String[] args) {
		
		//We can access parent class methods using super.method_name
		
		Second sec = new Second();
		sec.show();

	}

}

class First
{
	public void show()
	{
		System.out.println("From class First");
	}
}

class Second extends First
{
	public void show()
	{
		super.show();
		System.out.println("From class Second");
	}
}