package Methods_in_StringBuffer_and_StringBuilder;

public class Method_ensureCapacity {

	public static void main(String[] args) {
		
		//Increases the capacity manually if needed
		
		StringBuffer sb = new StringBuffer("Atharva");
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());

	}

}
