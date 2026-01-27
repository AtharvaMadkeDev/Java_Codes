package Constructors_in_Java;

public class Parameterized_this {

	public static void main(String[] args) {
		
		//We can give parameters inside this() to jump on the specific parameterized constructor
		//Here, when we called the constructor with "address" parameter , the this() is first passed to the constructor having "name" and "id", hence setting the values for "id" and "name" first and then the "address".
		
		p_this p = new p_this("Near Babar Dairy");
		p.show();

	}

}

class p_this
{
	int id;
	String name;
	String address;
	
	public p_this()
	{
		System.out.println("Non_parameterized constructor");
	}
	
	public p_this(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("From Parameterized constructor");
	}
	
	public p_this(String address)
	{
		this(1, "Atharva");
		this.address=address;
	}
	
	public void show()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}