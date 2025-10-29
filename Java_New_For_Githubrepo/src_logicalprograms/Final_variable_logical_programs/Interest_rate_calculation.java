package Final_variable_logical_programs;
import java.util.Scanner;
public class Interest_rate_calculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		
		System.out.println("Enter your name : ");
		ba.name = sc.nextLine();
		System.out.println("Enter your balance : ");
		ba.balance = sc.nextDouble();
		ba.display();
		
		sc.close();
	}

}

class BankAccount
{
	final double InterestRate = 6.5;
	String name;
	double balance;
	
	public void display()
	{
		double interest = (balance*InterestRate)/100;
		System.out.println("Calculated Interest = "+interest);
	}
}
