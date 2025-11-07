package String_class;

public class String_Immutability {

	public static void main(String[] args) {
		
		//String Immutability => Strings are immutable. It means that once a string object is created, its value cannot be changed unless and until we try to initialize it.
		
		String str = "Hello";
		str.concat(" World");
		System.out.println(str);
		//Output => Hello
		
		/**
		 * Why only "Hello"?
		 * => Because, the line 'str.concat( "World")' creates a new string, but we didn't stored it anywhere so 'str' still points to "Hello"
		 */
		
		//Correct way : 
		
		String str2 = "Hello";
		str2 = str2.concat(" World");  //indirectly reinitialized the value
		System.out.println(str2);
		
	}

}
