/* ENCAPSULATION
 * attributes of a class will be private or hidden
 * can be accessed only through methods (known as getters & setters)
 * attributes should be private if you don't have a reason to make them public/protected
 */

class Citizen {
    private String name;
    private int age;
    private String nationality;

    Citizen(String name, int age, String nationality) {
        this.setName(name);
        this.setAge(age);
        this.setNationality(nationality);
    }

    // getters - to retrieve an attribute
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    // setters - to set/change attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Japan", 18, "Thai");
        System.out.println("Name: " + citizen.getName());
        System.out.println("Age: " + citizen.getAge());
        System.out.println("Nationality: " + citizen.getNationality());

        citizen.setName("John Doe");
        citizen.setAge(38);
        citizen.setNationality("American");
        System.out.println("\nNew Name: " + citizen.getName());
        System.out.println("New Age: " + citizen.getAge());
        System.out.println("New Nationality: " + citizen.getNationality());
    }
}