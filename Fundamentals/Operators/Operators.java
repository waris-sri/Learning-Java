public class Operators {
    public static void main(String[] args) {
        // logical operators (&&, ||) are for boolean values, bitwise logical operators are used with integers
        
        /* LOGICAL OPERATORS */
        boolean andResult = true && false;
        System.out.println("true && false: " + andResult);
        boolean orResult = false || false;
        System.out.println("false || false: " + orResult);
        boolean notResult = !false;
        System.out.println("!false: " + notResult);
        
        /* SHORT-CIRCUIT BEHAVIOR
         * For &&, if the left operand is false, the right operand is not evaluated.
         * For ||, if the left operand is true, the right operand is not evaluated.
         */
        String str = null;
        if (str != null && !str.isEmpty()) { // `str != null` is false, so it went straight to `else`
            System.out.println("String is not empty.");
        } else {
            System.out.println("\nString is empty or null.");
        }

        /* BITWISE LOGICAL OPERATORS */
        int result1 = 5 & 3; /* 0101 AND (intersect)
                                0011
                              → 0001 → 1 */
        System.out.println("\n5 & 3 >> " + result1);
        int result2 = 8 | 29; /* 01000 OR (0's got overlapped by 1's)
                                 11101
                               → 11101 → 29 */
        System.out.println("8 | 29 >> " + result2);
        int result3 = 69 ^ 420; /* 001000101 XOR (1 for unlike bits, 0 for like bits)
                                   110100100
                                 → 111100001 → 481 */
        System.out.println("69 ^ 420 >> " + result3);
    }
}