public class Classroom {

  public static void main(String[] args) {
    // Create a new student object with the given information
    Students beam = new Students(
      "Waris Sripatoomrak",
      "Saint Gabriel's College",
      "Mahidol University",
      18,
      1.78f
    );
    Students japan = new Students(
      "Thanakrit Sriphiphattana",
      "Saint Gabriel's College",
      "Chulalongkorn University",
      18,
      1.77f
    );
    Students nay = new Students(
      "Phonlaphat Sitthadetwong",
      "Saint Gabriel's College",
      "Mahidol University",
      17,
      1.65f
    );
    Students aie = new Students(
      "Thanet Reantongcome",
      "Saint Gabriel's College",
      "Chulalongkorn University",
      18,
      1.78f
    );

    // Call the learn method on each student object to print out a message
    System.out.println();
    beam.learn(beam.name);
    japan.learn(japan.name);
    nay.learn(nay.name);
    aie.learn(aie.name);

    // Call the rest method on each student object to print out a message
    System.out.println();
    beam.rest(beam.name);
    japan.rest(japan.name);
    nay.rest(nay.name);
    aie.rest(aie.name);

    // Call the attend method on each student object to print out a message
    System.out.println();
    beam.attend(beam.name);
    japan.attend(japan.name);
    nay.attend(nay.name);
    aie.attend(aie.name);

    // Call the absent method on each student object to print out a message
    System.out.println();
    beam.absent(beam.name);
    japan.absent(japan.name);
    nay.absent(nay.name);
    aie.absent(aie.name);
  }
}
