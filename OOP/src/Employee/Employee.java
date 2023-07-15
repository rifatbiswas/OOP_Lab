package Employee;

// Base class Employee
class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}
