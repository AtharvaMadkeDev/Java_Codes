package Constructors_in_Java;

public class This_keyword_in_constructors_1 {

	public static void main(String[] args) {
		
		
		//"this" refers to the current class object.
		//It is used to initialize instance variables as well as to pass the value from the constructor to the class methods.
		
		//Syntax for setting up instance variables :
		
		This_keyword thiskeyword = new This_keyword(1,"Atharva");
		thiskeyword.show();

	}

}

class This_keyword
{
	int id;
	String name;
	
	public This_keyword(int id, String name)
	{
		this.id=id;				//Setting values of instance variables using "this" keyword.
		this.name=name;			//Setting values of instance variables using "this" keyword.
	}
	
	public void show()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}