package Final_variable_logical_programs;
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Answer ans = new Answer();
		System.out.println("Enter the radius :");
		ans.r = sc.nextDouble();
		ans.display();
		System.out.println();
		
		sc.close();
	}

}

class Answer
{
	final double pi=3.14159;
	double r;
	
	public void display()
	{
		
		double result = pi*r*r;
		System.out.println("Area of circle = "+result);
	}
	
}