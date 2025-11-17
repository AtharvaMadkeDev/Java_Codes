package Methods_in_StringBuffer_and_StringBuilder;

public class Method_insert {

	public static void main(String[] args) {
		
		//Inserts data at a specific index
		
		StringBuilder sb = new StringBuilder("HelloWorld");
		sb.insert(5," ");
		System.out.println(sb);

	}

}
