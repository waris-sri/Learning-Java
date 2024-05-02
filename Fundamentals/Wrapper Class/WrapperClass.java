/* Wrapper Classes:
 * uses primitive data types as if they're reference data types
 *  ex. boolean → Boolean
 *  ex. char → Character
 *  ex. int → Integer
 * can be used with collections ex. ArrayList<>
 * 
 * Autoboxing: converts between primitives and wrappers
 * Unboxing: converts wrapper classes to corresponding primitive types when needed
 */
public class WrapperClass {
    public static void main(String[] args) {
        // Boolean a = true;
        // Character b = '@';
        Integer c = 100;
        // Double d = 3.14;
        // String e = "Japan";
        if (c == 100)
            System.out.println("True");
    }
}