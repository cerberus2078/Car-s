
import java.util.Scanner;

// GIT comment

public class cars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	Car car = new Car("Toyota","RAV4",40);
	

	while(true){
	System.out.println("a=accelerate b=break x=exit");
	String answer = in.nextLine();
	if(answer.equals("a"))
	{
		car.accelerate();
	}
	else if(answer.equals("b"))
	{
		car.brake();
	}
	else if(answer.equals("x"))
	{
		break;
	}

	}
}
	
}

class Car{
	
	private String brand = "Kia";
	private String model = "Rio";
	private int amountOfFuel = 2;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public Car() {
		String brand = "";
		String model = "";
		int amountOfFuel = 0;
	}
	
	public Car(String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		printData();
	}
	
	public void brake() {
		System.out.println("Car is breaking");
	}
	
	public void accelerate() {
	    
	    if (amountOfFuel > 0)
	    {
		System.out.println("Car is accelerating");
		amountOfFuel = amountOfFuel - 1;
	    }
	}
	
	public void refuel(int amount) {
		System.out.println("Fuel in the tank: " + amountOfFuel);
		System.out.println("Refuel: " + amount);
		amountOfFuel = amountOfFuel + amount;
		System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
	}
	
	protected void printData() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel: " + amountOfFuel);
	}
	
	public void fuel() {
		System.out.println(amountOfFuel);
	}
	
}