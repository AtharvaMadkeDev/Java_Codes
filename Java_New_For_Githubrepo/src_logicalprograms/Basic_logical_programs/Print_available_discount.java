package Basic_logical_programs;

public class Print_available_discount {

	public static void main(String[] args) {
		
		double totalamount=1000;;
		
		if(totalamount>=5000)
		{
			System.out.println("20% discount");
		}
		
		else if(totalamount>=2500)
		{
			System.out.println("10% discount");
		}
		
		else if(totalamount>=1250)
		{
			System.out.println("5% discount");
		}
		
		else
		{
			System.out.println("not eligible for discount");
		}

	}

}
