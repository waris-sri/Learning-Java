/* GENERICS (parameterized types)
 * flexible class, methods, or interfaces that can be parameterized with one or more type parameters
 *   - allow type (Integer, String, user-defined...) to be parameters (doesn't allow primitive types)
 */

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Printer<String> print = new Printer<>("This is a string!");
        print.print();
        
        Printer<Integer> printInteger = new Printer<>(12345);
        printInteger.print();

        Animal animal = new Animal();
        AnimalPrinter<String, Animal> printCat = new AnimalPrinter<>("Whiskers", animal);
        printCat.print();

        Shout shout = new Shout();
        shout.shout("Ahhhhh", 4649);
        
        Lists lists = new Lists();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        lists.printList(stringList);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(54321);
        lists.printList(integerList);
        
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Whiskers", 3, "Domestic Shorthair"));
        lists.printListAnimal(catList);
    }
}

// GENERIC CLASSES
//             a type parameter (could be anything)
class Printer <T> {
    T message;
    public Printer(T message) {
        this.message = message;
    }
    public void print() {
        System.out.println(message.toString());
    }
}

class Animal {
    String animalName;
    int age;
    public void animalInfo(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }
}

// generics with inheritance is called "bounded generics"
class AnimalPrinter <U, V extends Animal> {
    U name;
    V animal;
    public AnimalPrinter(U name, V animal) {
        this.name = name;
        this.animal = animal;
        this.animal.animalInfo((String)name, 3);
    }
    public void print() {
        System.out.println("Name: " + name + ", Age: " + animal.age);
    }
}

// GENERIC METHODS
class Shout {
    public <W, X> void shout(W o1, X o2) {
        System.out.println(o1 + "!!! " + o2 + "!!!");
    }
}

class Lists {
    public void printList(List<?> myList) { // this is "bounded wildcard"
        for (Object obj : myList) {
            System.out.println(obj.toString());
        }
    }
    public void printListAnimal(List<? extends Animal> myList) {
        for (Animal obj : myList) {
            if (obj instanceof Cat) {
                Cat cat = (Cat) obj;
                System.out.println("Cat {" +
                        "animalName = '" + cat.animalName + '\'' +
                        ", age = " + cat.age +
                        ", breed = '" + cat.breed + '\'' +
                        '}');
            } else {
                System.out.println(obj.toString());
            }
        }
    }
}