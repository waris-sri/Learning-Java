/* POLYMORPHISM
 * refers to the ability of objects to respond differently to the same message/method call
 * allows for flexible and reusable code
 * basically method overloading and method overriding
 * when overloading or overriding a method, you've already done polymorphism
 */

class Animal {
    void makeSound() {
        System.out.println("An animal sounds!");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says woof!");
    }
}

class Cat extends Animal {
    public String breed;

    @Override
    public void makeSound() {
        System.out.println("Cat says meow!");
    }
}

class Shape {
    public void draw(String color) {
        System.out.println("Drawing a shape with color " + color);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Shape shape = new Shape();
        shape.draw("red");

        Animal[] animals = { cat, dog };
        for (Animal x : animals) {
            x.makeSound();
        }
    }
}