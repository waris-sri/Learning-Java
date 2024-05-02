import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math; 

public class BetterMortgage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float principal = getInputInRange(scan, "Principal (฿1000~1,000,000): ", 1000, 1_000_000);
        float rate = getInputInRange(scan, "Annual Interest Rate (1~30): ", 1, 30);
        byte year = (byte) getInputInRange(scan, "Period (1~30 yrs): ", 1, 30);

        float monthlyRate = (rate / 100) / 12;
        byte months = (byte) (year * 12);

        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
        double ratio = Math.pow((1 + monthlyRate), months);

        Object finalMortgage = (principal * (monthlyRate * ratio) / (ratio - 1));
        String outputMortgage = mortgage.format(finalMortgage);

        System.out.println("Monthly Mortgage (฿): " + outputMortgage);
    }

    private static float getInputInRange(Scanner scan, String prompt, int min, int max) {
        float input;
        while (true) {
            System.out.print(prompt);
            input = scan.nextFloat();
            if (input >= min && input <= max) {
                break;
            } else System.out.println("Enter a number within the range of " + min + " and " + max + ".");
        } return input;
    }
}