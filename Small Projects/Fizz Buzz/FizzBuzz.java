/* RULES:
 * divisible by 5 = Fizz
 * divisible by 3 = Buzz
 * divisible by both 5 and 3 = FizzBuzz
 * divisible by neither = the entered number
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Number: ");
            int num = scanner.nextInt();
            System.out.println((num % 5 == 0) && (num % 3 == 0) ? "FizzBuzz"
                    : num % 5 == 0 ? "Fizz" : (num % 3 == 0 ? "Buzz" : num));
        }
    }
}