package Methods_in_StringBuffer_and_StringBuilder;

public class Method_delete {

	public static void main(String[] args) {
		
		//Deletes characters between to specific indexes
		
		StringBuffer sb = new StringBuffer("Atharva");
		sb.delete(2, 5);
		
		System.out.println(sb);
	}

}
