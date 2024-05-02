/* Implement a basic "AND" gate simulator using only the "NOT" and "OR" operators. */

public class Operators_Medium {
    public static void main(String[] args) {
        boolean p = false;
        boolean q = true;
        System.out.println("Output: " + !(!p || !q));
    }
}