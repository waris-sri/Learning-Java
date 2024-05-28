class Grandparent {
    Grandparent() {
        System.out.println("Grandparent's constructor called.");
    }
}

class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent's constructor called.");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child's constructor called.");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        new Child(); // prints messages from all 3 constructors in a top-down order
    }
}