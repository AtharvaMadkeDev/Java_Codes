package Methods_in_StringBuffer_and_StringBuilder;

public class Method_setLength {

	public static void main(String[] args) {
		
		//Changes the length of the string
		
		StringBuilder sb = new StringBuilder("Hello World");
		sb.setLength(5);
		System.out.println(sb);

	}

}
