public class Temporary extends Contract {
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary(Employee employee, double hourlySalary, int accumulatedHours) {
        super(employee);
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double calculateAccumulatedSalary() {
        return hourlySalary * accumulatedHours;
    }

    @Override
    public String toString() {
        return "Temporary{" +
                "hourlySalary=" + hourlySalary +
                ", accumulatedHours=" + accumulatedHours +
                "} " + super.toString();
    }
}
