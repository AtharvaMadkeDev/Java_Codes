package Static_variable_logical_programs;

public class Display_details_of_employees_working_in_same_company {

	public static void main(String[] args) {
		
		Details e1 = new Details();
		
		System.out.println("Company : "+Details.company);
		e1.name="Atharva M. Madke";
		e1.salary=43214.456;
		e1.display();
		System.out.println();
		
		Details e2 = new Details();
		
		System.out.println("Company : "+Details.company);
		e2.name="Pranav M. Supekar";
		e2.salary=40345.345;
		e2.display();
		System.out.println();
		
		Details e3 = new Details();
		
		System.out.println("Company : "+Details.company);
		e3.name="Gayatri V. Ahire";
		e3.salary=54056.456;
		e3.display();
	}

}

class Details
{
	static String company = "USS";
	String name;
	double salary;
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		
	}
}