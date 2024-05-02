public class StaticKeyword {
    public static void main(String[] args) {
        
        /* Static Properties:
         * belongs to a class rather than an object (instance) of the class + shared by all objects of that class  
         * links between classes instead of methods
         * can be accessed directly by the class name without creating an object of that class (no `new`)
         * mainly used for memory management (is memory-saving)
         */

        Friends friend1 = new Friends("Japan");
        Friends friend2 = new Friends("Nay");
        Friends friend3 = new Friends("Aie");

        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);
        // all outputs 3, because they are shared among objects and belong to a class

        System.out.println("You have " + Friends.numOfFriends + " friends.");
    }
}
