public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private String category;

    public Vehicle(String make, String plate, String color, String category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    // Getter methods

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", plate='" + plate + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
