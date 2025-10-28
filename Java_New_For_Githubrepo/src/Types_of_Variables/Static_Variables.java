package Types_of_Variables;

public class Static_Variables {

	public static void main(String[] args) {
		
		Student s1 = new Student("Atharva");
		Student s2 = new Student("Pranav");
		Student s3 = new Student("Gayatri");
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}

class Student
{
	String name;
	static int namecount=0;  //static variable  (Accessible / shared within all the instances of the same class and shares the same copy of that variable
	
	public Student(String name)  //constructor with parameter or parameters
	{
		this.name=name;
		namecount++;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Total Employees : "+namecount);
		System.out.println();
	}
}