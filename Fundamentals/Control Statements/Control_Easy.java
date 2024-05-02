/* Craft a basic calculator that can execute operations like addition, subtraction,
multiplication, and division grounded on user preference using switch statements. */
import java.util.Scanner;
public class Control_Easy {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // prompt for 2 number inputs
            System.out.print("Enter the first number >> ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the second number >> ");
            double num2 = scan.nextDouble();
            
            // prompt for an operation
            System.out.print("Select an operation (+, -, x, /) >> ");
            char operation = scan.next().charAt(0); // only take in the first character of the string
            
            // use `switch` statements to handle the calculations
            switch (operation) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 'x':
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        break;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        break;
                    }
                default:
                    System.out.println("Unknown operation: Enter +, -, x, or /");
            }
        }
    }
}