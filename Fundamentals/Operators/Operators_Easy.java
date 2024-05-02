/* Given three boolean variables a, b, and c. Determine if only one of them is true. */

public class Operators_Easy {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if ((a && !b && c) || (!a && b && !c) || (!a && !b && c)) {
            System.out.println("Only one expression is true.");
        } else {
            System.out.println("None or more than one of the expressions are true.");
        }
    }
}
