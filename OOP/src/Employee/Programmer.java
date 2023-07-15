package Employee;

// Subclass Programmer
class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    // Override the calculateSalary() method for Programmer
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overtimeHours * hourlyRate);
    }
}
