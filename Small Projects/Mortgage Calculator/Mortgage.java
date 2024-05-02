import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;
public class Mortgage {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Prompt for principal (THB) and check the requirements
                // declare the var outside the loop to use it globally
            float principal;
                // use an infinite loop to keep asking the user to finally enter the valid value
            while (true) {
                System.out.print("Principal (฿1000~1,000,000): ");
                principal = scan.nextFloat();
                // if the value is within the specified range, break the loop
                if (principal >= 1000 && principal <= 1000000)
                    break;
                // otherwise, print a message
                else System.out.println("Enter a number within the range of 1,000 and 1,000,000.");
            }
            // Prompt for annual interest rate and check the requirements
            float rate;
            while (true) {
                System.out.print("Annual Interest Rate (1~30): ");
                rate = scan.nextFloat();
                if (rate > 0 && rate <= 30)
                    break;
                else System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            }
            // Convert to monthly rate
            float monthlyRate = (rate / 100) / 12;
            // Prompt for period as in years and check the requirements
            byte year;
            while (true) {
                System.out.print("Period (1~30 yrs): ");
                year = scan.nextByte();
                if (year >= 1 && year <= 30)
                    break;
                else System.out.println("Enter a number within the range of 1 and 30.");
            }
            // Convert to months
            final byte months = (byte) (year * 12);
            // Format the output as currency
            NumberFormat mortgage = NumberFormat.getCurrencyInstance();
            // Calculate (1+r)^n once, then substitute into the formula
            double ratio = Math.pow((1 + monthlyRate), months);
            // Calculate the mortgage then print it out with formatting
            Object finalMortgage = (principal * (monthlyRate * ratio) / (ratio - 1));
            String outputMortgage = mortgage.format(finalMortgage);
            System.out.println("Monthly Mortgage (฿): " + outputMortgage);
        }
    }
}