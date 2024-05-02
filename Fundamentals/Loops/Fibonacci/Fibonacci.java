import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers do you want to print out? ");
        long num = scan.nextLong();
        long n1 = 0, n2 = 1;
        int countTracker = 1; // keeps track of how many numbers have been printed out
        
        System.out.print("First " + num + " Fibonacci numbers: " + n1 + ", " + n2); // as a headstart, print this first
        while (countTracker <= num - 2) { // subtracted by 2 as we already have the first two numbers in our sequence
            long sum = n1 + n2;
            System.out.print(", " + sum);
            n1 = n2; // move the numbers: make the first number equal to the second one
            n2 = sum; // and then calculate the next number in the sequence: make the second number equal to the recent sum
            countTracker++; // keep incrementing the countTracker by one
        }
        
        scan.close();
    }
}