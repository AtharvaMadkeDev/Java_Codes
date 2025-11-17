package Methods_in_StringBuffer_and_StringBuilder;

public class Method_deleteCharAt {

	public static void main(String[] args) {
		
		//Deletes a single character at the given position
		
		StringBuilder sb = new StringBuilder("Atharva");
		sb.deleteCharAt(2);
		
		System.out.println(sb);
		
	}

}
