package Constructors_in_Java;

public class Super_keyword_1 {

	public static void main(String[] args) {
		
		//super() is used to call the parent class constructor as well as methods. 
		//super() must be the first line of the constructor
		
		Child c = new Child();

	}

}

class Parent
{
	public Parent()
	{
		System.out.println("From Parent class");
	}
}

class Child extends Parent		//child class extending extending parent class to access the parent class properties as well
{
	public Child()
	{
		//there is by default a super() call in the constructor.
		//super();
		System.out.println("From Child class");
	}
}