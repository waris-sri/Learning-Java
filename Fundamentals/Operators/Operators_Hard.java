/* Design a system that takes a sequence (an array) of binary inputs and outputs their logical AND, OR, and XOR results. */

public class Operators_Hard {
    public static void main(String[] args) {
        int[] binarySequence = { 1, 1, 1, 0, 1, 0, 0 };

        int ANDResult = binarySequence[0];
        int ORResult = binarySequence[0];
        int XORResult = binarySequence[0];

        for (int i = 1; i < binarySequence.length; i++) {
            ANDResult &= binarySequence[i];
            ORResult |= binarySequence[i];
            XORResult ^= binarySequence[i];
        }

        System.out.println("AND of the sequence: " + ANDResult);
        System.out.println("OR of the sequence: " + ORResult);
        System.out.println("XOR of the sequence: " + XORResult);
    }
}
