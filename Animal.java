package Overriding;

    public class Animal {
        void makeSound(){
            System.out.println("The animal makes a sound.");
        }
    }
    class Dog extends Animal{
        void makeSound(){
            System.out.println("The Dog barks");
        }
    }
    class Cat extends Animal{
        void makeSound(){
            System.out.println("The Cat meows");
        }
    }
class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

    }
}
