import java.util.Scanner;
import java.util.stream.IntStream;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // Print from 2 to `n`
            int[] nums = new int[n - 1]; // - 1 to remove `0` at the end
            nums = IntStream.rangeClosed(2, n).toArray();
            solve(n, nums);
        }
    }

    static void solve(int n, int[] nums) {
        boolean isPrime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true; // Let all values in prime array be marked (`true`) right away
        }
        for (int j = 2; j * j <= n; j++) {
            if (isPrime[j] == true) {
                for (int i = j * j; i <= n; i += j) {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true)
                System.out.print(i + " ");
        }
    }
}
