public enum CarType {
    Sedan("Sedan"),
    SUV("SUV"),
    Hatchback("Hatchback"),
    MINIVAN("Minivan"),
    Sport("Sport"),
    Automatic("Automatic");

    private final String value;

    CarType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}