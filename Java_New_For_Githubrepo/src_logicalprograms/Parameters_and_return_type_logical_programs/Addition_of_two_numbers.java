package Parameters_and_return_type_logical_programs;
import java.util.Scanner;
public class Addition_of_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Addition add = new Addition();
		
		System.out.println("Enter the two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = add.display(a, b);
		
		System.out.println("Sum : "+result);
		
	}

}

class Addition
{
	
	public int display(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
}