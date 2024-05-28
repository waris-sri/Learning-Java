public class Human {
    // (constructors can be instantiated inside classes, EXCEPT the Main class)

    // declare values
    String name;
    int age;
    double weight;

    // constructor for a human with matching arguments
    Human(String name, int age, double weight) {
        // assign the values using the `this` keyword
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(String food) {
        System.out.println(this.name + " is eating " + food + "…");
    }

    void drink(String beverage) {
        System.out.println(this.name + " is drinking " + beverage + " *gulp*");
    }

    // toString() is a special method that returns a string representation of an
    // object; can be used both implicitly and explicitly
    public String toString() {
        return this.name + ", who is " + this.age + " years old and weighs " + this.weight + " kg.";
    }
}