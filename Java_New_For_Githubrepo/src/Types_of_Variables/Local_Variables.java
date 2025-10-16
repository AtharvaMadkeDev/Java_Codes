package Types_of_Variables;

public class Local_Variables {

	public static void main(String[] args) {
		
		

	}

}

class local_Variable
{
	public void show()
	{
		int a=1;    //local variable present inside a method
		int b=2;    //local variable present inside a method
		System.out.println(a+", "+b);
	}
	
	public void newshow()
	{
		//System.out.println(a+", "+b);    //Not accessible in this method.....
	}
}

