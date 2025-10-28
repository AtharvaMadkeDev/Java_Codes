package Local_variable_logical_programs;
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
		
		areaOfCircle aoc = new areaOfCircle();
		aoc.display();

	}

}

class areaOfCircle
{
	public void display()
	{
		double area;
		double radius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		
		radius = sc.nextDouble();
		area=3.14*radius*radius;
		
		System.out.println("Area of Circle = "+area);
		
		sc.close();
		
	}
}