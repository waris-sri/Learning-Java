/* A common application in software development is the creation of menu-driven programs.
These are interactive programs that allow users to choose from a list of options, leading them through
different functionalities of an application.

Using the do-while loop, we aim to design a basic structure for such a program.
The loop ensures that the menu is presented to the user until they decide to exit,
allowing for repeated interactions. */

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n—— MENU ——");
            System.out.println("(1) Menu A");
            System.out.println("(2) Menu B");
            System.out.println("(3) Menu C");
            
            choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("You chose Menu A");
                    break;
                case 2:
                    System.out.println("You chose Menu B");
                    break;
                case 3:
                    System.out.println("You chose Menu C");
                    break;
            }
        } while (choice != 3);
        
        
        scan.close();
    }
}