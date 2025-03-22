class Car{
	private String brand;
	private String model;
	private int year;
	private int speed;
	
	public Car(){
		this.brand = "Unknown";
		this.model = "Unknown";
		this.year = 0;
		this.speed = 0;
		}

	public Car(String brand, String model, int year, int speed) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.speed = speed;
	}
	public void displayInfo() {
		System.out.println("Car Information: " + year + " " + brand + " " + model + ", Speed: " + speed + " km/h");
	}

	public void accelerate(int incrementSpeed){
		speed += incrementSpeed;
		System.out.println(brand + " " + model + " accelerated! New Speed: " + speed + " km/h");
		}
}

public class carApp{
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", 2022, 50);
		Car car2 = new Car("Honda", "Civic", 2021, 60);
		System.out.println("Before Acceleration:");
		car1.displayInfo();
		car2.displayInfo();
		car1.accelerate(20);
		car2.accelerate(30);
		System.out.println("\nAfter Acceleration:");
		car1.displayInfo();
		car2.displayInfo();
	}
}