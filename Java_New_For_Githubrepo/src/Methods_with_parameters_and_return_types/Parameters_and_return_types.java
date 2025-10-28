package Methods_with_parameters_and_return_types;

public class Parameters_and_return_types {

	public static void main(String[] args) {
		
		Calculator calci = new Calculator();
		System.out.println("From add method : "+calci.add(2, 3));
		
		calci.displaysum(2, 3);		//here 2,3 are arguments
	}
	
}
	

class Calculator
{

	public int add(int x, int y)	//here int x, int y are the parameters
	{
		return x+y;					//returns integer value
	}
	
	public void displaysum(int x, int y)		//int x and int y are parameters
	{
		int sum = x+y;
		System.out.println("From displaysum method : "+sum);		//return type is void therefore does not return anything
	}
}


