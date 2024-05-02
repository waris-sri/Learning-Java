/* HackerRank Practice Problems */
// Java Loops II
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = 1;
        for (int j = 0; j < q; j++) {
            int a = 0;
            int b = 2;
            int n = 10;
            int result = a;
            for (int i = 0; i < n; i++) {
                result += Math.pow(2, i) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}