public class Programmer extends Employee {
    private int nbProjects;

    public Programmer(String name, int birthYear, double monthlyIncome, int nbProjects) {
        super(name, birthYear, monthlyIncome, 100); 
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birthYear, double monthlyIncome, int nbProjects, double occupationRate) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, 1873, 100); 
        this.nbProjects = nbProjects;
        setVehicle(vehicle);
        System.out.println("We have a new employee: " + this);
    }

    public Programmer(String name, int birthYear, int nbProjects, Car vehicle) {
        super(name, birthYear, 1865, 100);
        this.nbProjects = nbProjects;
        setVehicle(vehicle);
        System.out.println("We have a new employee: " + this);
    }

    public Programmer(String name, int birthYear, int j, int k, Motorcycle m1) {
        super(name, birthYear, 73634, 100);
    }

    public Programmer(String name, int birthYear, int j, int k, Car vt4) {
        super(name, birthYear, 1053, 100);
    }

    public Programmer(String name, int birthYear, int j) {
        super(name, birthYear, j, 100);
    }

    @Override
    public double annualIncome() {
        double baseIncome = super.annualIncome();
        double projectBonus = nbProjects * 200;
        return baseIncome + projectBonus;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", birthYear=" + getBirthYear() +
                ", monthlyIncome=" + getMonthlyIncome() +
                ", occupationRate=" + getOccupationRate() +
                ", nbProjects=" + nbProjects +
                '}';
    }
}
