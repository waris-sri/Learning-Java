/* Construct a rudimentary traffic light system. Given a color (Red, Yellow, Green),
your program should display corresponding messages, like "Stop" for Red. */

import java.util.Scanner;

public class Control_Medium {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a color (red, yellow, green) >> ");
            String color = scan.nextLine().toLowerCase().trim();
            switch (color) {
                case "red":
                    System.out.println("Stop!");
                    break;
                case "yellow":
                    System.out.println("Prepare to stop!");
                    break;
                case "green":
                    System.out.println("Go!");
                    break;
                default:
                    System.out.println("Invalid color: Enter either \"red,\" \"yellow,\" or \"green.\"");
                    break;
            }
        }
    }
}
