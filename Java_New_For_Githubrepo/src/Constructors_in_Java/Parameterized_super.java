package Constructors_in_Java;

public class Parameterized_super {

	public static void main(String[] args) {
		
		//Works similar like this(). Instead of jumping to the same class constructor, it jumps to the parent class constructor
		
		child c = new child("Near Babar Dairy");
		c.show();

	}

}

class parent
{
	int id;
	String name;
	
	public parent()
	{
		System.out.println("From Non-parameterized constructor of 'parent' class...");
	}
	
	public parent(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("From Parameterized constructor of 'parent' class...");
	}
}

class child extends parent
{
	String address;
	
	public child(String address)
	{
		super(1, "Atharva");
		this.address=address;
	}
	
	public void show()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
	
}