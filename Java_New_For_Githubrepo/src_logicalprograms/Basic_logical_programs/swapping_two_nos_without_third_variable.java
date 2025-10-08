package Basic_logical_programs;

public class swapping_two_nos_without_third_variable {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();
	}

}
