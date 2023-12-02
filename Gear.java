public enum Gear {
    Automatic("Automatic"),
    Manual("Manual");

    private final String value;

    Gear(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
