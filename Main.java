// Main class
public class Main {
    public static void main(String[] args) {
        // Instantiate Car
        Car car = new Car("Toyota", "Corolla", 2020, 120);
        System.out.println("Car attributes:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Maximum Speed: " + car.maximumSpeed);
        car.drive();

        // Instantiate Bike
        Bike bike = new Bike("Honda", "CBR500R", 2022, 150);
        System.out.println("Bike attributes:");
        System.out.println("Make: " + bike.make);
        System.out.println("Model: " + bike.model);
        System.out.println("Year: " + bike.year);
        System.out.println("Maximum Speed: " + bike.maximumSpeed);
        bike.drive();
    }
}