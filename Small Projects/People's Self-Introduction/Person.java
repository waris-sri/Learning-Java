import java.util.Scanner;

class Person {
    // initiate variables
    String name;
    int age;
    static int personCounter = 0;

    // create the `Person` (same name as the class) constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCounter++;
    }

    // create the `speak` method for self-introduction
    public void speak() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Hello! This is " + this.name + " and I'm " + this.age + " years old.");
        }
    }

    // start using and printing the code
    public static void main(String[] args) {

        // create a new object of type `Person` with the given arguments
        Person no1 = new Person("Japan", 18);
        Person no2 = new Person("Nay", 17);

        // call the methods
        no1.speak();
        no2.speak();
        System.out.println("Total: " + personCounter + " people");
    }
}