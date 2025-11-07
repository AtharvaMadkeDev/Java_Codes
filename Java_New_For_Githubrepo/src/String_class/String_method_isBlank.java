package String_class;

public class String_method_isBlank {

	public static void main(String[] args) {
		
		// .isBlank() => It checks whether the string is blank or not. It does not count the blank spaces and considers them as blank. 
		
		String str = "   ";
		System.out.println(str.isBlank());

	}

}
