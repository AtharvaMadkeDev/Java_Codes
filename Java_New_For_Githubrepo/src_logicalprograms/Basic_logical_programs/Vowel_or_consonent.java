package Basic_logical_programs;
import java.util.*;
public class Vowel_or_consonent {

	public static void main(String[] args) {
		
		System.out.println("Enter any alphabet");
		Scanner scan = new Scanner(System.in);
		char vc;
		vc = scan.nextLine().charAt(0);
		
		if(vc=='a' || vc=='e' || vc=='i' || vc=='o' || vc=='u' || vc=='A' || vc=='E' || vc=='I' || vc=='O' || vc=='U'	)
		{
			System.out.println("It is a VOWEL");
		}
		
		else
		{
			System.out.println("It is a CONSONENT");
		}
	}

}
