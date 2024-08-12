// Vehicle class
    public class Vehicle {
        String make;
        String model;
        int year;
        int maximumSpeed;

        public Vehicle(String make, String model, int year, int maximumSpeed) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.maximumSpeed = maximumSpeed;
        }

        public void drive() {
            System.out.println("Vehicle is driving");
        }
    }

    // Car subclass
    class Car extends Vehicle {
        public Car(String make, String model, int year, int maximumSpeed) {
            super(make, model, year, maximumSpeed);
        }

        @Override
        public void drive() {
            System.out.println(make + " " + model + " Car is driving");
        }
    }

    // Bike subclass
    class Bike extends Vehicle {
        public Bike(String make, String model, int year, int maximumSpeed) {
            super(make, model, year, maximumSpeed);
        }

        @Override
        public void drive() {
            System.out.println(make + " " + model + " Bike is driving");
        }
    }


