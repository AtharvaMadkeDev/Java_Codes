package Static_variable_logical_programs;

public class Count_number_of_objects_created {

	public static void main(String[] args) {
		
		objectCounter obj1 = new objectCounter();
		obj1.display();
		System.out.println();
		
		objectCounter obj2 = new objectCounter();
		obj2.display();
		System.out.println();
		
		objectCounter obj3 = new objectCounter();
		obj3.display();
		System.out.println();
		
		
		//objectCounter newdisp = new objectCounter();
		System.out.println("Total objects created : "+objectCounter.counter);
	}

}

class objectCounter
{
	static int counter=0;
	
	public void display()
	{
		counter++;
		System.out.println("Object "+counter+" created!");
		
	}
	
	public void display2()
	{
		System.out.println(counter);
	}
}