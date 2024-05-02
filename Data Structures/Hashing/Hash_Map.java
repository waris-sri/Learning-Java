/* HASH MAP:
 * implements the Map interface (needs import)
 * similar to ArrayList<>, but has key–value pairs instead of index numbers in arrays
 * stores unique objects and needs a hash function for indexing
 *   - uses Wrapper Classes (converting primitive data type into object)
 * no hash code values
 * e.g. (name, email), (username, userID), (capital, country)
 */
import java.util.HashMap;
public class Hash_Map {
    public static void main(String[] args) {
        //      key     value
        HashMap<String, String> countries = new HashMap<String, String>();
        // Java will only pick 1 entry when there are duplicates (unique entries only)
        countries.put("Thailand", "Bangkok");
        countries.put("Thailand", "Bangkok");
        countries.put("France", "Paris");
        countries.put("USA", "Washington D.C.");
        countries.put("Japan", "Tokyo");
        countries.put("Peru", "Lima");
        countries.put("Netherlands", "Amsterdam");
        countries.put("Sweden", "Stockholm");
        countries.put("Finland", "Helsinki");
        countries.put("South Korea", "Seoul");
        countries.put("Russia", "Moscow");
        countries.put("Australia", "Canberra");
        // loop through each element
        // get keys with `keySet()`, get values with `.get()`
        for (String i : countries.keySet()) {
            System.out.println("Key: " + i + "\t\t Value: " + countries.get(i));
        }
        System.out.println("There are " + countries.size() + " countries");
    }
}