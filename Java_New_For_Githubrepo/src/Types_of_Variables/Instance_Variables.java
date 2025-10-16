package Types_of_Variables;

public class Instance_Variables {

	public static void main(String[] args) {
		
		Car car1=new Car();		//Creating object of Car 1 for Car 1 details
		car1.brand="Tesla";		//value of brand for car1 
		car1.colour="Red";		//value of colour for car1
		car1.speed=200;			//value of speed for car1
		System.out.println("Car 1 details : ");
		car1.displayinfo();		//Calling method with Car 1 details
		
		System.out.println();
		
		Car car2=new Car();		//Creating object of Car 2 for Car 2 details
		car2.brand="BMW";		//value of brand for car2
		car2.colour="Black";	//value of colour for car2
		car2.speed=180;			//value of speed for car2
		System.out.println("Car 2 details : ");
		car2.displayinfo();		//Calling method with Car 2 details

	}

}

class Car
{
String brand;		//Instance variable
String colour;		//Instance variable
int speed;			//Instance variable

	public void displayinfo()	//method to display car details
	{
		System.out.println("Brand"+brand);
		System.out.println("Colour"+colour);
		System.out.println("Speed"+speed);
	}
}