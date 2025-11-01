package Array_logical_programs;
import java.util.Scanner;


public class Average_and_Total_of_elements {

	public static void main(String[] args) {
		
		double marks [] = new double [5];
		double average, total=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of 5 subjects");
		
		for(int temp=0; temp<marks.length; temp++)
		{
			marks[temp] = sc.nextDouble();
		}
		
		for(int i=0; i<marks.length; i++)
		{
			total = total + marks[i];
		}
		
		average = total/marks.length;
		
		System.out.println("Total of Marks = "+total);
		System.out.println("Average of Marks = "+average);
		
		sc.close();
		
	}

}
