/* DESERIALIZATION
 * - reversed process of serialization; converts a byte stream into an object
 * - basically loading a saved file
 */

/* HOW TO SERIALIZE (SAVE)
 * - decalre the same object as null (no initiation)
 * - must implement Serializable interface (needs import)
 * - get .ser file from path... (FileInputStream)
 * - read the file (ObjectInputStream)
*/

package Fundamentals.Serialization.Deserialization;
import java.io.*;

public class Deserialization {
    
    public static class User implements Serializable {
        String name;
        String password;
        public void greet() {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        
        FileInputStream fileIn = new FileInputStream("D:\\Java\\Learning\\Fundamentals\\Serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        System.out.println(user.name);
        System.out.println(user.password);
        user.greet();
    }
}