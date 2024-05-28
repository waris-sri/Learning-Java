import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // method (or function) is a block of code that's executed when called upon
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Who are you?");
            String name = scanner.nextLine();
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            hello(name, age);
        }
    }

    // the parameters don't have to match
    static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("You're " + age + " years old.");
    }
}