package Employee;

// Subclass Manager
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Override the calculateSalary() method for Manager
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
