package Constructors_in_Java;

public class Parameterized_Constructor {

	public static void main(String[] args) {
		
		//It is a constructor which takes/accepts parameters
		
		One_3 one = new One_3(23);		//A constructor call which accepts an id as a parameter
		one.show();

	}

}

//Syntax : 

class One_3
{
	int id;
	
	public One_3(int i)	//Constructor taking parameters
	{
		id=i;
	}
	
	public void show()
	{
		System.out.println("ID : "+id);
	}
}