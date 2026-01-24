package Constructors_in_Java;

public class Super_keyword_2 {

	public static void main(String[] args) {
		
		//We can access parent class variables using super.variable_name
		
		B b = new B();
		b.show();

	}

}

class A
{
	int x=10;
}

class B extends A
{
	int x=20;
	
	public void show()
	{
		System.out.println("value of 'x' From A : "+super.x);
		System.out.println("value of 'x' From B : "+x);
	}
}