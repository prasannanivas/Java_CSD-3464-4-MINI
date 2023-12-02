public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int birthYear, double monthlyIncome, int nbBugs) {
        super(name, birthYear, monthlyIncome, 100); 
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, double monthlyIncome, int nbBugs, double occupationRate) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, int nbBugs, Vehicle vehicle) {
        super(name, birthYear, 873, 100); 
        this.nbBugs = nbBugs;
        setVehicle(vehicle);
        System.out.println("We have a new employee: " + this);
    }

    public Tester(String name, int birthYear, int j, int k, Motorcycle m2) {
        super(name, birthYear, 981, 100);
    }

    @Override
    public double annualIncome() {
        double baseIncome = super.annualIncome();
        double bugBonus = nbBugs * 10;
        return baseIncome + bugBonus;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", birthYear=" + getBirthYear() +
                ", monthlyIncome=" + getMonthlyIncome() +
                ", occupationRate=" + getOccupationRate() +
                ", nbBugs=" + nbBugs +
                '}';
    }
}
