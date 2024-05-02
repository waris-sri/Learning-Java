// Packages & Imports
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Basic Syntax: https://java8.info/images/mainsyntax.webp

// ↓ Functions & Classes ↓
// modifier|keyword|FileName
public class Main {
//  modifier|keyword|return type|methodName|parameters(arguments)
    /* Keywords:
    public = can be globally accessed
    static = allows the method to be firstly called */
    public static void main(String[] args) {
        /*
        <<PRIMITIVE DATA TYPES>> (no need to allocate memory):
        • - not objects
        • - no members
        TYPE     BYTE     RANGE
        -----------------------------
        byte     1        [-128, 127]
        short    2        [-32K, 32K]
        int      4        [-2B, 2B]
        long     8        
        float    4        
        double   8        
        char     2        A, B, C, …
        boolean  1        true, false
        
        <<REFERENCE DATA TYPES>>
        • - are complex objects ex. dates, mails, …
        • - must allocate memory with operators, ex. `new`
        • - has members which can be accessed by `.`
            - classes, field, types, and whatnot have members too
        */
        Date current = new Date(); // allocate memory for reference type
        System.out.println(current); // `out` is a field that has a type of PrintStream, which is a class
        
    
        /* Arrays[] (FIXED length) */
        int[] num = new int[5];
        
        // Tedious way
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        System.out.println("Array Address: " + num); // outputs the address (since it's a reference type)
        System.out.println(Arrays.toString(num));
        
        // Better way
        int[] num2 = { 6, 9, 10, 7, 8, 10 };
        System.out.println("Unsorted: " + Arrays.toString(num2));
        Arrays.sort(num2);
        System.out.println("Sorted: " + Arrays.toString(num2));
        System.out.println("Length: " + num2.length);
        
        // Multi-dimensional (array of arrays)
        // pin-pointing each data:
        // String[][] parkingLot = new String[3][3];
        // parkingLot[0][0] = "Tesla";
        // parkingLot[0][1] = "Yaris";
        // parkingLot[0][2] = "Ranger";
        // parkingLot[1][0] = "Ferrari";
        // parkingLot[1][1] = "Mustang";
        // parkingLot[1][2] = "Honda";
        // parkingLot[2][0] = "Carry";
        // parkingLot[2][1] = "Corvette";
        // parkingLot[2][2] = "Silverado";
        // formatted as array:
        String[][] parkingLot = {   {"Tesla", "Yaris", "Ranger"},
                                    {"Ferrari", "Mustang", "Honda"},
                                    {"Carry", "Corvette", "Silverado"}  };
        for (byte x = 0; x < parkingLot.length; x++) {
            System.out.println();
            for (byte y = 0; y < parkingLot[x].length; y++) {
                System.out.print(parkingLot[x][y] + " ");
            }
        }

        /* Array of Objects */
        String animal1 = new String("lion");
        String animal2 = new String("tiger");
        String[] zooAnimals = {animal1, animal2};
        System.out.println("\n\nZoo Animals:\n" + zooAnimals[0] + "\n" + zooAnimals[1] + "\n");

        /* Casting & Arithmetic Expressions */
        // Implicit/Explicit casting in GoodNotes
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14F;
        double d = 3.14D;
        System.out.println((int)((b * s) - i + l + f * d)); // cast all of them to an integer

        int w = 1;
        int x = w++; // postfix: returns value before incrementation
        System.out.println(w);
        System.out.println(x); 

        /* Math */
        double ceiling = Math.ceil(3.2F);
        int random = (int) (Math.random() * 1000);
        System.out.println(ceiling);
        System.out.println(random);

        /* Formatting Numbers */
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // no instantiating (allocating memory) here since NumberFormat is an abstract class, so use the factoring method (create a new object instead)
        String currencyResult = currency.format(1234567890.50);
        System.out.println(currencyResult);
        
        String decimalToPercent = NumberFormat.getPercentInstance().format(0.5); // shorthand
        System.out.println(decimalToPercent);
        
        /* User Input (Scanner) */
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int userNum = scan.nextInt();
            scan.nextLine(); // Consume the newline character to prevent outputting an empty string
            System.out.println(" → Your number is " + userNum);

            System.out.print("Who are you?: ");
            String userFullName = scan.nextLine().trim(); // to get the whole line of input, and to cut excess white spaces
            System.out.println(" → Hello, " + userFullName + "!");
        }

        /* Control Flow */
        int temp = 22;
        boolean isWarm = temp > 20 && temp < 30; // && = logical AND
        System.out.println(isWarm);

        boolean highIncome = true;
        boolean goodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (highIncome || goodCredit) && !hasCriminalRecord; // || = logical OR, ! = NOT
        System.out.println(isEligible);

        /* If Statements */
        int temperature = 21;
        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink some water");
        }
        else if (temperature > 20 && temperature < 30)
            System.out.println("It's a beautiful day");
        else
            System.out.println("It's freezing cold");
        // Simplified (Ternary Operator)
        //                  if                          else if                          else
        System.out.println((temperature > 30 ? "Hot" : (temperature > 20 ? "Beautiful" : "Freezing")) + " weather today!");

        /* Switch Statements */
        switch (temperature) {
            // only check if values match back-to-back
            case 30:
                System.out.println("Hot Day");
                break; // once a match is found, and the code block is executed, exit from the `switch` statements as a whole
            case 20:
                System.out.println("Beautiful Day");
                break;
            default: // basically `else`
                System.out.println("Cold Day");
        }

        /* For Loops (better when we know how many times we wanna repeat sth) */
        for (int j = 0; j < 5; j++) {
            System.out.println("Japan" + j);
        }

        /* While Loops (better when we DON'T know how many times we wanna repeat sth) */
        // checks condition first
        // keeps executing its block until a specified condition is met
        int j = 0;
        while (j < 5) {
            System.out.println("JAPAN" + j);
            j++;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            String input = "";
            while (!input.equals("quit")) {
                System.out.print("Input: ");
                if (scanner.hasNext()) {
                    input = scanner.next().toLowerCase();
                    System.out.println(input);
                } else {
                    // Handle the case when there is no input available
                    System.out.println("No input available.");
                    break;
                }

                if (input.equals("quit")) {
                    break;
                }
            }
        }

        /* For-Each Loop (iterate over arrays/collections) */
        // Limitation: only can go forwards, so effects won't take place when edit items; we can't iterate
        String[] fruits = { "apple", "orange", "banana" };
        for (int k = 0; k < fruits.length; k++)
            System.out.println("I like " + fruits[k]);
        // or
        for (String fruit : fruits)
            System.out.println("I like " + fruit);
    }
}