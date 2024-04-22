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

package Fundamentals.Serialization;
import java.io.*;

public class Serialization {
    
    public static class User implements Serializable {
        String name;
        String password;
        public void greet() {
            System.out.println("Hello, " + name + "!");
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.name = "John";
        user.password = "12345";
        user.greet();

        FileOutputStream fileOut = new FileOutputStream("D:\\Java\\Learning\\Fundamentals\\Serialization\\UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println(">> Serialized data saved as \"UserInfo.ser\"");
    }
}