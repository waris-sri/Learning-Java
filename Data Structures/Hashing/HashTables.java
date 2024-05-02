/* HASH TABLES (Data Structure Concept)
 * a data structures used by HashMap and HashSet
 * collection of data values that are each assigned a unique key
 */
import java.util.Hashtable;
public class HashTables {
    public static void main(String[] args) {
        // key as integer
        System.out.println("KEY AS INTEGER");
        Hashtable<Integer, String> table1 = new Hashtable<Integer, String>(4);
        table1.put(111, "A");
        table1.put(222, "B");
        table1.put(333, "C");
        table1.put(343, "D");
        table1.put(444, "E");
        table1.put(404, "F");
        for (Integer key : table1.keySet()) {
            System.out.println("Hash: " + key.hashCode() + "\tIndex: " + key.hashCode()%4 + "\tKey: " + key + "\tValue: " + table1.get(key));
        }
        // key as string
        System.out.println("\nKEY AS STRING");
        Hashtable<String, String> table2 = new Hashtable<String, String>(4);
        table2.put("111", "A");
        table2.put("222", "B");
        table2.put("333", "C");
        table2.put("343", "D");
        table2.put("444", "E");
        table2.put("404", "F");
        for (String key : table2.keySet()) {
            System.out.println("Hash: " + key.hashCode() + "\tIndex: " + key.hashCode()%4 + "\tKey: " + key + "\tValue: " + table2.get(key));
        }
    }
}