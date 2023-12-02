import java.time.Year;
import java.util.ArrayList;
import java.util.List;

// Employee class represents an individual employed in a company.
public class Employee {
    // Private instance variables to store employee information.
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private double occupationRate;
    private List<Contract> contracts; // List to store employee contracts.
    public Vehicle vehicle; // Public field to represent an associated vehicle.

    // Constructor for creating an Employee object with basic information.
    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        setMonthlyIncome(monthlyIncome);
        this.contracts = new ArrayList<>(); // Initialize the list of contracts.
        setOccupationRate(occupationRate);
        setVehicle(vehicle); // Associate a vehicle with the employee.
        System.out.println("We have a new employee: " + toString());
    }

    // Getter methods for accessing private variables.
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

    // Setter method for setting the monthly income, ensuring non-negative values.
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    // Setter method for setting the occupation rate, ensuring it is within a valid range (10-100).
    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10) {
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = occupationRate;
        }
    }

    // Setter method for associating a vehicle with the employee.
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Getter method for retrieving the associated vehicle.
    public Vehicle getVehicle() {
        return this.vehicle;
    }

    // Method for calculating the age of the employee based on the current year.
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    // Method for calculating the annual income of the employee.
    public double annualIncome() {
        return 12 * monthlyIncome * occupationRate / 100;
    }

    // Method for signing a contract for the employee and adding it to the list.
    public void signContract(Contract contract) {
        contracts.add(contract);
        System.out.println("Contract signed for employee " + getName());
    }

    // Method for retrieving information about the employee's contracts.
    public String contractInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Contracts for ").append(getName()).append(":\n");

        for (Contract contract : contracts) {
            info.append(contract.toString()).append("\n");
        }

        return info.toString();
    }

    // Override of the toString method to provide a string representation of the Employee object.
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
