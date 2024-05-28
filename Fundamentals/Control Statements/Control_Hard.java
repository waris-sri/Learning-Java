/* Develop a program that classifies student grades (A, B, C, and so forth)
relying on given score intervals using the if-else-if ladder. */

import java.util.Scanner;

public class Control_Hard {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your grade: ");
            double grade = scan.nextDouble();

            // Using If Else If Ladder to classify the grade
            if (grade >= 97 && grade <= 100) {
                System.out.println("A+");
            } else if (grade >= 93 && grade <= 96) {
                System.out.println("A");
            } else if (grade >= 90 && grade <= 92) {
                System.out.println("A-");
            } else if (grade >= 87 && grade <= 89) {
                System.out.println("B+");
            } else if (grade >= 83 && grade <= 86) {
                System.out.println("B");
            } else if (grade >= 80 && grade <= 82) {
                System.out.println("B-");
            } else if (grade >= 77 && grade <= 79) {
                System.out.println("C+");
            } else if (grade >= 73 && grade <= 76) {
                System.out.println("C");
            } else if (grade >= 70 && grade <= 72) {
                System.out.println("C-");
            } else if (grade >= 67 && grade <= 69) {
                System.out.println("D+");
            } else if (grade >= 63 && grade <= 66) {
                System.out.println("D");
            } else if (grade >= 60 && grade <= 62) {
                System.out.println("D-");
            } else if (grade >= 0 && grade <= 59) {
                System.out.println("F");
            } else
                System.out.println("Invalid grade! Enter a number between 0 and 100.");
        } catch (Exception e) {
            System.out.println("Error in input!");
        }
    }
}