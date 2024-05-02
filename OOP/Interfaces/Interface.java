/* INTERFACES
 * prepare empty methods for later implementation in child classes by method overriding
 *   - only contains method signatures, no implementation details (no bodies)
 *   - basically templates for the methods that will be used in modules
 *   - mostly used for conveniently declaring methods that work the same or has the same name in modules
 */

interface Flyable {
    public String fly(); // Method Signature: The type of return value and parameters are not specified. They can be any data types.
}

interface Swimmable {
    public String swim();
}

class Bird implements Flyable {
    // `implements`: used for implementing interfaces, where a class agrees to implement the methods defined in an interface
    public String fly() {
        return "Fly like a bird.";
    }
}

class Fish implements Swimmable {
    public String swim() {
        return "Swim like a fish.";
    }
}

public class Interface {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.fly());
        Fish fish = new Fish();
        System.out.println(fish.swim());
    }
}