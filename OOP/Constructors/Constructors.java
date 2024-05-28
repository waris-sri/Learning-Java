public class Constructors {
    public static void main(String[] args) {

        // a special method that's called when an object is created (instantiated)
        // can take our arguments in when we're going to instantiate it

        Human human1 = new Human("Japan", 18, 88); // will create a new instance of class and call its constructor with
                                                   // matching arguments, if any, and execute the code
        Human human2 = new Human("Beam", 18, 77);
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        human2.drink("soda");
        human1.eat("an apple");
    }
}