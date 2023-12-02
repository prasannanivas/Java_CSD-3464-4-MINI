public enum VehicleType {
    RACE("Race"),
    NOT_FOR_RACE("Not for Race"),
    Family("Family");

    private final String value;

    VehicleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
