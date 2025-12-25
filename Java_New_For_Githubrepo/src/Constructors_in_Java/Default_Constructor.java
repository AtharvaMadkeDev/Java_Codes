package Constructors_in_Java;

public class Default_Constructor {

	public static void main(String[] args) {
		
		//When you dont manually writw a constructor, Java creates a constructor by default.
		One_1 o = new One_1();
		o.show();
		

	}

}

class One_1
{
	int id;
	//An invisible constructor created by java by default
	
	public void show()
	{
		System.out.println("ID : "+id);
	}
}