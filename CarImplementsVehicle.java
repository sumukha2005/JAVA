interface Vehicle {
    void start(); 

    default void honk() {
        System.out.println("Honking..!");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is Starting...!");
    }

   }

public class CarImplementsVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
    }
}
