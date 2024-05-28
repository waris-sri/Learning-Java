/* SINGLE INHERITANCE (`extend` keyword):
 * makes another class inherit attributes and methods from an existing class.
 * `extends` can only inherit from 1 class, unlike `implements` where you can inherit many classes at once
*/

class Animal {
    String name;
    String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Cat extends Animal {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Chokdee", "Siamese");
        System.out.println(myCat.name);
        System.out.println(myCat.breed);
        myCat.eat();
        myCat.sleep();
    }
}