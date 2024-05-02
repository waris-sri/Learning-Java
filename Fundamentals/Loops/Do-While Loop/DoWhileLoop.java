import java.util.Scanner;

public class DoWhileLoop {
    /* Do-While Loop: checks condition last, will be executed *at least once* even if the condition is false */
    public static void main(String[] args) {
        do {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Do you want to play again? (y/n) ");
                char choice = scan.next().charAt(0);
                if (choice == 'y') {
                    System.out.println("Starting game…");
                    break; // exit the loop if the user wants to replay to avoid exception
                }
            }
        } while (true);
    }
}