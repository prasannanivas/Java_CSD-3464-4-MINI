import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private double occupationRate;
    private List<Contract> contracts;
    public Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        setMonthlyIncome(monthlyIncome);
        this.contracts = new ArrayList<>();
        setOccupationRate(occupationRate);
        setVehicle(vehicle);
        System.out.println("We have a new employee: " + toString());
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    // Setter methods

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10) {
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = occupationRate;
        }
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public double annualIncome() {
        return 12 * monthlyIncome * occupationRate / 100;
    }

    public void signContract(Contract contract) {
        contracts.add(contract);
        System.out.println("Contract signed for employee " + getName());
    }

    public String contractInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Contracts for ").append(getName()).append(":\n");

        for (Contract contract : contracts) {
            info.append(contract.toString()).append("\n");
        }

        return info.toString();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", monthlyIncome=" + monthlyIncome +
                ", occupationRate=" + occupationRate +
                '}';
    }
}
