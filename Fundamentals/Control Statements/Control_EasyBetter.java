/* Craft a basic calculator that can execute operations like addition, subtraction,
multiplication, and division grounded on user preference using switch statements. */

import java.util.Scanner;

public class Control_EasyBetter {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // take user's input as strings
            System.out.println("Enter the numbers you want to operate, separate each of them by spaces:");
            String entries = scan.nextLine();
            // split them into invidual numbers
            String[] tokens = entries.split("\\s+"); // `\\s+` for handling multiple contiguous spaces
            // prepare a new array for doubles with the same size as `tokens`
            double[] individualNumbers = new double[tokens.length];
            // convert each of them to doubles
            for (int i = 0; i < tokens.length; i++) {
                individualNumbers[i] = Double.parseDouble(tokens[i]);
            }

            // ask for the desired operation
            System.out.print("Select an operation (+, -, x, /): ");
            char operation = scan.next().charAt(0);

            // prepare the variables to store the results, starting from index 0
            double AddResult = individualNumbers[0];
            double SubtractResult = individualNumbers[0];
            double MultiplyResult = individualNumbers[0];
            double DivideResult = individualNumbers[0];
            // loop through each one while performing the calculations
            for (int i = 1; i < individualNumbers.length; i++) {
                AddResult += individualNumbers[i];
                SubtractResult -= individualNumbers[i];
                MultiplyResult *= individualNumbers[i];
                DivideResult /= individualNumbers[i];
            }

            // calculate as per the selected operation
            switch (operation) {
                case '+':
                    System.out.println("Result: " + AddResult);
                    break;
                case '-':
                    System.out.println("Result: " + SubtractResult);
                    break;
                case 'x':
                    System.out.println("Result: " + MultiplyResult);
                    break;
                case '/':
                    // for division, check for zeros
                    if (individualNumbers.toString().contains("0")) {
                        System.out.println("Result: " + DivideResult);
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