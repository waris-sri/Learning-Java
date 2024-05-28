/* A simple sorting algorithm that repeatedly steps through the list,
compares adjacent elements, and swaps them if they are in the wrong order */

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 64, 34, 25, 12, 22, 11, 90 };
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}