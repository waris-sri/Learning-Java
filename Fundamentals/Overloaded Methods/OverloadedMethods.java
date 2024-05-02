public class OverloadedMethods {
    public static void main(String[] args) {
        // methods with the same name, but different parameters, therefore different method signatures
        // (method name + parameters = method signature)
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;
        System.out.println(multiply(a, b));
        System.out.println(multiply(a, b, c));
        System.out.println(multiply(a, b, c, d));
    }
    static int multiply(int a, int b) {
        System.out.println("Overloaded Method #1: ");
        return a * b;
    }
    static int multiply(int a, int b, int c) {
        System.out.println("Overloaded Method #2: ");
        return a * b * c;
    }
    static double multiply(double a, double b, double c, double d) {
        System.out.println("Overloaded Method #3: ");
        return a * b * c * d;
    }
}