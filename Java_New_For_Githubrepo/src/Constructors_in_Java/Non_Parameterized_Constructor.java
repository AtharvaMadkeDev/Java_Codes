package Constructors_in_Java;

public class Non_Parameterized_Constructor {

	public static void main(String[] args) {
		
		//It is a constructor which does not have any parameters.
		One_2 o = new One_2();
		o.show();
		
	}

}

//Syntax :

class One_2
{
	int id;
	public One_2()		//Parameter-less constructor
	{
		id=100;
	}
	
	public void show()
	{
		System.out.println("ID : "+id);
	}
}