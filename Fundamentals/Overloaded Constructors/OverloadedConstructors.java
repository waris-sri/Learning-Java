public class OverloadedConstructors {
    public static void main(String[] args) {
        // constructors with the same name, but different parameters, therefore different constructor signatures
        //     (constructor name + parameters = constructor signature)
        // this flexibility ensures objects can be created in multiple ways as per the requirement, offering different functionalities
        
        OverloadedConstructors salad = new OverloadedConstructors
        ("Cabbage", "Carrot", "Cherry Tomatoes", "Kelp", "Chicken", "Nuts", "Ranch Dressing");
        
        System.out.println("Ingredients In Your Salad:");
        System.out.printf("→ %s%n", salad.vegetable1);
        System.out.printf("→ %s%n", salad.vegetable2);
        System.out.printf("→ %s%n", salad.vegetable3);
        System.out.printf("→ %s%n", salad.vegetable4);
        System.out.printf("→ %s%n", salad.protein1);
        System.out.printf("→ %s%n", salad.protein2);
        System.out.printf("→ %s%n", salad.dressing);
    }
    
    String vegetable1;
    String vegetable2;
    String vegetable3;
    String vegetable4;
    String protein1;
    String protein2;
    String dressing;
    
    OverloadedConstructors(String vegetable1, String vegetable2, String vegetable3, String vegetable4, String protein1, String protein2, String dressing) {
        this.vegetable1 = vegetable1;
        this.vegetable2 = vegetable2;
        this.vegetable3 = vegetable3;
        this.vegetable4 = vegetable4;
        this.protein1 = protein1;
        this.protein2 = protein2;
        this.dressing = dressing;
    }
}