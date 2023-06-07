package employee_object;

class Emp {
    private static int count = 0; // Static variable to track the count of employees
    private String name;
    private int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
        count++; // Increment the count whenever a new employee object is created
    }

    public static int getCount() {
        return count; // Returns the count of employees
    }

}
public class Employee {
    public static void main(String[] args) {
        // Create employee objects
        Emp emp1 = new Emp("John", 1);
        Emp emp2 = new Emp("Alice", 2);
        Emp emp3 = new Emp("Bob", 3);
        Emp emp4 = new Emp("Sarah", 4);
        Emp emp5 = new Emp("David", 5);

        // Display the count of employees
        System.out.println("Number of employees: " + Emp.getCount());
    }
}

