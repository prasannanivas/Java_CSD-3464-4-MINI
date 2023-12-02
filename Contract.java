public abstract class Contract {
    private Employee employee;
    private boolean isActive;

    public Contract(Employee employee) {
        this.employee = employee;
        this.isActive = true;
    }

    public Contract() {
        this.employee = null;
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isActive() {
        return isActive;
    }

    public void deactivate() {
        isActive = false;
    }

    public abstract double calculateAccumulatedSalary();

    @Override
    public String toString() {
        return "Contract{" +
                "employee=" + employee.getName() +
                ", isActive=" + isActive +
                '}';
    }
}
