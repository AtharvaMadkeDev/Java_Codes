package Local_variable_logical_programs;

public class Sum_of_first_ten_natural_numbers {

	public static void main(String[] args) {
		
		Natural_nos n = new Natural_nos();
		n.display();

	}

}

class Natural_nos
{
	public void display()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum : "+sum);
	}
}