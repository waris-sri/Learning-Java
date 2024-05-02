import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows;
            int columns;
            String symbol = "";

            System.out.print("Rows: ");
            rows = scanner.nextInt();
            System.out.print("Columns: ");
            columns = scanner.nextInt();
            System.out.print("Symbol: ");
            symbol = scanner.next();
            
            for (int i = 1; i <= rows; i++) {
                System.out.println();
                for (int j = 1; j <= columns; j++) {
                    System.out.print(symbol);
                }
            }
        }
    }
}
