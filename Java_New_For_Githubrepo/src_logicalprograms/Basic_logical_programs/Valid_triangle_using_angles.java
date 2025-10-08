package Basic_logical_programs;

public class Valid_triangle_using_angles {

	public static void main(String[] args) {
		
		int a1=45, a2=45, a3=90;
		int total;
		
		total=a1+a2+a3;
		
		System.out.println(total);
		
		if(total==180)
		{
			System.out.println("It is a valid triangle");
		}
		
		else
		{
			System.out.println("Not a valid triangle");
		}
	}

}
