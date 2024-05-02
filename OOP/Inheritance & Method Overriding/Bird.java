/* METHOD OVERRIDING (`@Override` & `extends`)
 * re-declaring a parent class's method inside a subclass to give it a new implementation.
 * essentially reusing a method
*/

class Bird {
    void sound() {
        System.out.println("A bird chirps");
    }
}

class Sparrow extends Bird  { // Sparrow is a subclass of the Bird class, so it inherits all its methods
    
    @Override // doesn't add any functionality, but for good practice
    public void sound() {System.out.println("A sparrow chirps.");}
    
    public static void main(String[] args) {
        Sparrow mySparrow = new Sparrow();
        mySparrow.sound();  // calls the overridden `sound()` method in the Sparrow class
    }
}