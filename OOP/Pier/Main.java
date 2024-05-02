// Object Passing

public class Main {
    public static void main(String[] args) {
        Harbor harbor = new Harbor();
        Ships ship1 = new Ships("Ship #1");

        harbor.dock(ship1.shipName);
    }   
}