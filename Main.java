// Main.java
// This program demonstrates the difference between classes and objects in Java.

class Cat {
    // Attributes of the class Cat
    String breed;
    String color;
    int age;

    // Constructor for the class Cat
    Cat(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    // Method to display cats details
    void displayDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of class Cat
        Cat cat1 = new Cat("Blue Bi-color Ragdoll", "Grey and white", 2);

        // Creating another object of class Cat with different attributes
        Cat cat2 = new Cat("Mainecoon", "White", 5);

        // Displaying details of cat 1
        System.out.println("Details of cat 1:");
        cat1.displayDetails();

        // Displaying details of cat 2
        System.out.println("\nDetails of cat 2:");
        cat2.displayDetails();

        // Demonstrating that cat 1 and cat 2 are different objects
        System.out.println("\nChanging the color of cat 1 to brown...");
        cat1.color = "brown";

        // Displaying details after the change of cat 1
        System.out.println("\nDetails of cat 1 after color change:");
        cat1.displayDetails();
        System.out.println("\nDetails of cat 2 remain unchanged:");
        cat2.displayDetails();
    }
}
