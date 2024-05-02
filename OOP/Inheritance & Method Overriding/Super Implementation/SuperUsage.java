/* Consider a scenario where we have a Vehicle class with a method description(), and a Car class that extends Vehicle.
The Car class wants to provide additional details in the description but also wants to keep the basic details provided
by the Vehicle class. This is where super comes into play. */

class Vehicle {
    void description() {
        System.out.println("This is your normal, generic vehicle.");
    }
}

class Car extends Vehicle {
    @Override // because we re-declared the parent class's method
    void description() {
        super.description(); // to call the method from the parent class
        System.out.println("This is a car; it has four wheels and a steering wheel");
    }
}

public class SuperUsage {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.description();
    }
}