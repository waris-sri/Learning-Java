// (must create a new method outside the Main one; yet, not necessary to do so in a separate file)

public class Students {
    public static Object others;
    String name;
    String school;
    String university;
    int age;
    float height;

    Students(String name, String school, String university, int age, float height) {
        this.name = name;
        this.school = school;
        this.university = university;
        this.age = age;
        this.height = height;
    }

    void learn(String name) {
        System.out.println(this.name + " is learning…");
    }

    void rest(String name) {
        System.out.println(this.name + " is taking a rest…");
    }

    void attend(String name) {
        System.out.printf("%24s: Present ✅%n", this.name);
    }

    void absent(String name) {
        System.out.printf("%24s: Absent ❌%n", this.name);
    }
}

class Beam {
    String name = "Waris Sripatoomrak";
    String school = "Saint Gabriel's College";
    String university = "Mahidol University";
    int age = 18;
    float height = 1.78f;
}

class Japan {
    String name = "Thanakrit Sriphiphattana";
    String school = "Saint Gabriel's College";
    String university = "Chulalongkorn University";
    int age = 18;
    float height = 1.77f;
}

class Nay {
    String name = "Phonlaphat Sitthadetwongggg";
    String school = "Saint Gabriel's College";
    String university = "Mahidol University";
    int age = 17;
    float height = 1.65f;
}

class Aie {
    String name = "Thanet Reantongcome";
    String school = "Saint Gabriel's College";
    String university = "Chulalongkorn University";
    int age = 18;
    float height = 1.78f;
}