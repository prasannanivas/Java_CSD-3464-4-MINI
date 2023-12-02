public class Car extends Vehicle {
    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category.getValue());
        this.gear = gear;
        this.type = type;
    }

    public Gear getGear() {
        return gear;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + getMake() + '\'' +
                ", plate='" + getPlate() + '\'' +
                ", color='" + getColor() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", gear=" + gear +
                ", type=" + type +
                '}';
    }
}
