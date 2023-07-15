package Employee;

// Main class to test the subclasses
public class Main {
    public static void main(String[] args) {
        // Create objects of Manager and Programmer
        Manager manager = new Manager("John Doe", 5000, 1000);
        Programmer programmer = new Programmer("Jane Smith", 4000, 10, 20);

        // Call the calculateSalary() method for each subclass
        System.out.println("Manager " + manager.getName() + " salary: $" + manager.calculateSalary());
        System.out.println("Programmer " + programmer.getName() + " salary: $" + programmer.calculateSalary());
    }
}
