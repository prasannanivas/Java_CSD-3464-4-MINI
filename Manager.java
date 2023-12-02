public class Manager extends Employee {
    private int nbClients;
    private int nbTravelDays;

    public Manager(String name, int birthYear, double monthlyIncome, int nbClients, int nbTravelDays) {
        super(name, birthYear, monthlyIncome, 100); 
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
    }

    public Manager(String name, int birthYear, double monthlyIncome, int nbClients, int nbTravelDays,
            double occupationRate) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle) {
        super(name, birthYear, 1870, 100);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        setVehicle(vehicle);
        System.out.println("We have a new employee: " + this);
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear, 1820, 100); 
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
    }

    public Manager(String name, int birthYear, int j, int k, int l, Car vt2) {
        super(name, birthYear, 1919, 100);
    }

    @Override
    public double annualIncome() {
        double baseIncome = super.annualIncome();
        double clientBonus = nbClients * 500;
        double travelBonus = nbTravelDays * 100;
        return baseIncome + clientBonus + travelBonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", birthYear=" + getBirthYear() +
                ", monthlyIncome=" + getMonthlyIncome() +
                ", occupationRate=" + getOccupationRate() +
                ", nbClients=" + nbClients +
                ", nbTravelDays=" + nbTravelDays +
                '}';
    }
}
