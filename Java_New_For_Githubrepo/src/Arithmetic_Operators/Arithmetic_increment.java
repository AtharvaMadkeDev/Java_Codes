package Arithmetic_Operators;

public class Arithmetic_increment {

	public static void main(String[] args) {
		
		//denoted with '++' sign
		
		/**
		 * 1) Pre-increment
		 */
		System.out.println("Pre-increment");
		int x=5;
		int y=++x;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		System.out.println();
		
		/**
		 * 2) Post-increment
		 */
		System.out.println("Post-increment");
		int a=5;
		int b=a++;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
