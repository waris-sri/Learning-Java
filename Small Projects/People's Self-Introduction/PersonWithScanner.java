
// import Scanner
import java.util.Scanner;

public class PersonWithScanner {
    // initialize variables
    String name;
    int age;

    // create a constructor with those variables as arguments
    PersonWithScanner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // create a method for the people to introduce themselves
    void introduce() {
        System.out.println("Hey, this is " + this.name + " and I'm " + this.age + " years old.");
    }

    // run the code
    public static void main(String[] args) {
        // use `try` method to prevent Scanner resource leak
        try (Scanner scan = new Scanner(System.in)) {
            // ask for the count of people and store them
            System.out.print("Enter the number of people: ");
            int numPeople = scan.nextInt();
            scan.nextLine();
            // prepare an array to hold all the people with its indices from `numPeople`
            PersonWithScanner[] peopleArray = new PersonWithScanner[numPeople];

            // create a loop which runs until it reaches the amount of people asked by user
            // (`peopleArray.length`)
            for (int i = 0; i < peopleArray.length; i++) {
                // ask for each person's name and age
                System.out.printf("%d) Name: ", i + 1);
                String name = scan.nextLine(); // consume the new line character
                System.out.print("Age: ");
                int age = scan.nextInt();
                scan.nextLine(); // consume the new line character again
                // store the inputted values into the corresponding arguments in the
                // `peopleArray` array
                peopleArray[i] = new PersonWithScanner(name, age);
            }

            // using a for-each loop, finally print the introduction message for every
            // single person
            // declare a new variable `eachPerson` inside it to access the data externally
            for (PersonWithScanner eachPerson : peopleArray) {
                eachPerson.introduce();
            }
        }
    }
}