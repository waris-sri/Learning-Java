/* SERIALIZATION
 * - converts an object into a byte stream (.ser) file
 *   - .ser is platform independent
 * - saves (= persists) the current state of an object after the program exists
 * - the file can be saved locally, to another machine, or stored in a network
 * - basically saving a file with the object's information
 */

/* HOW TO SERIALIZE (SAVE)
 * - the object class must implement Serializable interface (needs import)
 * - save .ser file as... on path... (FileOutputStream)
 * - write the file out to save (ObjectOutputStream)
 */

/* DESERIALIZATION
 * - reversed process of serialization; converts a byte stream into an object
 * - basically loading a saved file
 */

/* HOW TO DESERIALIZE (READ)
 * - declare the same object as null (no initiation)
 * - must implement Serializable interface (needs import)
 * - get .ser file from path... (FileInputStream)
 * - read the file (ObjectInputStream)
 */

package Fundamentals.Serialization;
import java.io.*;

public class Serializer {
    
    public static class User implements Serializable {
        private static final long serialVersionUID = 1L;
        String name;
        String password;
        transient String secret; // Do not serialize this
        public void greet() {
            System.out.println("Hello, " + this.name + "!");
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialize
        try {
            User user = new User();
            user.name = "Beam";
            user.password = "12345";
            user.secret = "This is a secret message";
            user.greet();
    
            FileOutputStream fileOut = new FileOutputStream("/Users/warissripatoomrak/Documents/Learning-Java/Fundamentals/Serialization/UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println(">> Serialized data saved as \"UserInfo.ser\"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Deserialize
        try {
            FileInputStream fileIn = new FileInputStream("/Users/warissripatoomrak/Documents/Learning-Java/Fundamentals/Serialization/UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User user = (User) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("\n>> Successfully deserialized \"UserInfo.ser\":");
            System.out.println(user.name);
            System.out.println(user.password);
            System.out.println(user.secret); // Will output null
            user.greet();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}