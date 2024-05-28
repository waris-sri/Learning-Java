/* MULTIPLE INHERITANCE (`implements`)
 * lets you simultaneously inherit multiple classes; an upgrade of `extends`
*/

// use interfaces to prepare empty methods for later implementation in child classes by method overriding them
interface Employee {
    void getEmployeeDetails();
}

interface Address {
    void getAddressDetails();
}

interface Salary {
    void getSalaryDetails();
}

class employeeContacts implements Employee, Address, Salary {
    @Override
    public void getSalaryDetails() {
        System.out.println("[Employee's salary details]");
    }

    @Override
    public void getAddressDetails() {
        System.out.println("[Employee's address details]");
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("[Employee's general details]");
    }
}

public class Person {
    public static void main(String[] args) {
        // create object of the Employee class which is a subclass of Person
        employeeContacts employee = new employeeContacts();
        // calling methods from both interfaces using the implemented interface objects
        employee.getEmployeeDetails();
        employee.getAddressDetails();
        employee.getSalaryDetails();
    }
}