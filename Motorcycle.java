public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean hasSidecar) {
        super(make, plate, color, category.getValue());
        this.hasSidecar = hasSidecar;
    }


    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + getMake() + '\'' +
                ", plate='" + getPlate() + '\'' +
                ", color='" + getColor() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", hasSidecar=" + hasSidecar +
                '}';
    }
}
