public class Permanent extends Contract {
    private int nbChildren;
    private boolean married;
    private double monthlySalary;
    private double bonusPerChildPerMonth;
    private int accumulatedDays;

    // Constructor

    public Permanent(int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth,
            int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    public Permanent(Employee employee, int nbChildren, boolean married, double monthlySalary,
            double bonusPerChildPerMonth, int accumulatedDays) {
        super(employee);
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public double calculateAccumulatedSalary() {
        double childrenBonus = (married ? nbChildren * bonusPerChildPerMonth : 0);
        double dailySalary = monthlySalary / Management.workingDaysPerMonth;
        return accumulatedDays * dailySalary + childrenBonus;
    }

    public void performAnnualReview() {
        System.out.println("Annual review conducted for " + getEmployee().getName());
    }

  
    public double calculatePensionContribution() {
        return 0.0; 
    }
    
    @Override
    public String toString() {
        return "Permanent{" +
                "nbChildren=" + nbChildren +
                ", married=" + married +
                ", monthlySalary=" + monthlySalary +
                ", bonusPerChildPerMonth=" + bonusPerChildPerMonth +
                ", accumulatedDays=" + accumulatedDays +
                "} " + super.toString();
    }
}
