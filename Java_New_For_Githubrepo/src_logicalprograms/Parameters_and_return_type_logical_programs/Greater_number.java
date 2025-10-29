package Parameters_and_return_type_logical_programs;
import java.util.Scanner;
public class Greater_number {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		Greater greater = new Greater();
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = greater.display(a, b);
		System.out.println("Greater number : "+result);
		sc.close();
	}

}

class Greater
{
	public int display(int a, int b)
	{
		if(a>b) 
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}