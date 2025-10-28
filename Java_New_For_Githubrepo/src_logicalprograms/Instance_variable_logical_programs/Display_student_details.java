package Instance_variable_logical_programs;

public class Display_student_details {

	public static void main(String[] args) {
		
		System.out.println("Student details :- ");
		System.out.println();
		
		Student s1 = new Student();
		s1.name="Atharva";
		s1.rollno=12;
		s1.marks=90;
		s1.display();
		
		System.out.println();
		
		Student s2 = new Student();
		s2.name="Pranav";
		s2.rollno=13;
		s2.marks=89;
		s2.display();
		
		System.out.println();
		
		Student s3 = new Student();
		s3.name="Gayatri";
		s3.rollno=11;
		s3.marks=95;
		s3.display();
	}

}

class Student
{
	String name;
	int rollno;
	double marks;
	
	public void display() 
	{
		System.out.println("Name of student : "+name);
		System.out.println("Roll number : "+rollno);
		System.out.println("Marks : "+marks);
	}
}