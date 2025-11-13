package String_interning;

public class Concept_of_String_Interning {

	public static void main(String[] args) {
		 
		//It is the process of storing unique copy of each String inside the SCP(String Constant Pool). So all the identical strings share the same location(Memory location)
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		str3 = str3.intern();		//'str3' now points to the references of 'str1' and 'str2'
		
		System.out.println((str1==str3)+"  "+(str2==str3));		//Answer is true because now they all point to the same reference

	}

}
