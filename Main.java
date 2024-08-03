// Abstract class
abstract class Animal {
    // Abstract method
    public abstract void sound();

    // Non-abstract method
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Concrete subclass
class Cat extends Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of concrete subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling the abstract method
        dog.sound(); // Output: The dog barks.
        cat.sound(); // Output: The cat meows.

        // Calling the non-abstract method
        dog.eat(); // Output: The animal is eating.
        cat.eat(); // Output: The animal is eating.
    }
}

