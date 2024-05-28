/* DYNAMIC POLYMORPHISM
 * the ability of an object to take on many forms when the program is running
 * leverages inheritance and method overriding to enable flexible behavior based on object types at runtime
 * "dynamic" = after compilation phase; during runtime
 */

import java.util.Scanner;

class Animal {
    public void speak() {
        System.out.println("An animal sounds!");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks!");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // make space in the memory, waiting for user's input, then carry on accordingly
        Animal animal;

        System.out.print("Are you a cat or a dog person?\n(1) Cat (2) Dog\n>> ");
        int choice = scan.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Invalid choice! Let's make it a default animal.");
            animal.speak();
        }

        scan.close();
    }
}
