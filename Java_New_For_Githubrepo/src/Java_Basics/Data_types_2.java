package Java_Basics;

public class Data_types_2 {

	public static void main(String[] args) {

		/**
		 * 2) Non-Primitive Data-types
		 */
		
		
		Bike b1=new Bike();   //Object is a Non-primitive data-type
		b1.brand="Ultraviolette F77 Superstreet (Recon)";
		b1.speed=155;
		b1.accelerate();
		
		
		ElectricBike eb = new ElectricBike();
		eb.start();
		
		

	}

}

class Bike    //Class is a Non-primitive data-type
{
	String brand;
	int speed;
	public void accelerate()
	{
		System.out.println(brand+" is accelerating at maximum speed of "+speed+"kmph");
	}
}


class A_Array
{
	public void disp()
	{
		int [] scores = new int [5];    //Array is a Non-primitive data-type
		scores[0]=100;
		scores[1]=200;
		scores[2]=300;
		scores[3]=400;
		scores[4]=500;
	}
}


class S_strings
{
	public void disp2()
	{
		String name = "Atharva";    //String is a Non-primitive data-type
		System.out.println(name);
	}
}



interface Vehicle    //Interface is a Non-primitive data-type
{
	void start();
	
}

class ElectricBike implements Vehicle
{
	public void start()
	{
		System.out.println("The Electric Bike has started!!!");
	}
}

class enum_info
{
//	enum level{LOW,MEDIUM,HIGH}     //enum is a Non-primitive data-type
//	Level myLevel = level.HIGH;
//	System.out.println(myLevel);
}
