/* SERIALIZATION
* - converts an object into a byte stream (.ser) file
*   - .ser is platform independent
* - saves the current state of an object after the program exists
* - the file can be saved locally, to another machine, or stored in a network
* - basically saving a file with the object's information
* 
* DESERIALIZATION
* - reversed process of serialization; converts a byte stream into an object
* - basically loading a saved file
*/

package Fundamentals.Serialization;

public class Serialization {
    
    public static class User {
        String name;
        String password;
        public void greet() {
            System.out.println("Hello, " + name + "!");
        }
    }
    
    public static void main(String[] args) {
        User user = new User();
        user.name = "John";
        user.password = "12345";
        user.greet();
    }
}