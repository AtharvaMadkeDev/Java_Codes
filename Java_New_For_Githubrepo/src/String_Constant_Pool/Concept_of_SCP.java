package String_Constant_Pool;

public class Concept_of_SCP {

	public static void main(String[] args) {
		
		String s1 = "Atharva";
		String s2 = "Atharva";
		
		//As the String literal "Atharva" already exists in SCP which is a specialized part of the heap memory, the reference 's2' points to the same reference as 's1'
		
		System.out.println(s1==s2);		//As 's2' points to same reference as 's1', the answer is true 
		
		
		String str1 = new String("Abc");
		String str2 = new String("Abc");
		
		//Here, the 'str1' and 'str2' are declared as a String Object. 
		//Therefore the reference of 'str2' and 'str1' will be different even if their contents are same. 
		
		System.out.println(str1==str2);		//The reference of 'str2' will not point to the reference of 'str1' because of the 'new' keyword, i.e both are different objects and therefore, the answer is False
	}

}
