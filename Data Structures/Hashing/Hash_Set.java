/* HASH SET:
 * implements the Set interface (needs import)
 * only has keys, no values
 * stores objects and needs a hash function for indexing
 *   - uses Wrapper Classes (converting primitive data type into object)
 */
import java.util.HashSet;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-8);
        numbers.add(18);
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " exists");
            } else {
                System.out.println(i + " doesn't exist");
            }
        }
    }
}
