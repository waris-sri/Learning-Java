/* ABSTRACTION
 * abstract classes can't be instantiated
 * however, abstract subclasses can be decalred without implementation
 * adds a layer of security on vague classes it's declared in
 */

abstract class Vehicle {
    abstract void run();
}

class Car extends Vehicle {
    @Override public void run() { System.out.println("The car is up and running."); };
}

public class Abstraction {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
    }
}