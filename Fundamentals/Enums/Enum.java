/* ENUMS (ENUMERATED)
 * ordered listing of constants, which behave like objects, in a collection
 * e.g. days of the week, months of the year, planets in the solar system
 */

enum Planets {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int order;
    Planets (int order) {
        this.order = order;
    }
}

public class Enum {
    public static void main(String[] args) {
        Planets myPlanet = Planets.MERCURY; // assign value to enum variable
        isHabitable(myPlanet);
    }

    static void isHabitable(Planets myPlanet) {
        switch(myPlanet) {
            case EARTH:
                System.out.println("The Earth is habitable.");
                System.out.printf("This is the planet #%d.", myPlanet.order);
                break;
            default:
                System.out.println("This planet is not yet habitable.");
                System.out.printf("This is the planet #%d.", myPlanet.order);
        }
    }
}