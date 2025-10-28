package Instance_variable_logical_programs;

public class Display_details_of_car {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.brand="BMW";
		c1.speed=200;
		c1.price=2500000.950;
		c1.display();
		
		System.out.println();
		
		Car c2 = new Car();
		c2.brand="Mercedes";
		c2.speed=250;
		c2.price=4500000.00;
		c2.display();

	}

}

class Car
{
	String brand;
	int speed;
	double price;
	
	public void display() 
	{
		System.out.println("Brand name : "+brand);
		System.out.println("Car speed : "+speed+" km/hr");
		System.out.println("Car price = "+price);
	}
}