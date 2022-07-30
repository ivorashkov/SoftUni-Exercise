package NotFinishedYet.TEST_ENUM;

public class Coffee {
    private String roastType;
    private double price;
    private String name;

    public Coffee(String roastType, double price, String name) {
        setRoastType(roastType);
        this.price = price;
        this.name = name;
    }

    private void setRoastType(String roastType) {
        for (CoffeeRoastType cr : CoffeeRoastType.values()) {
            if (cr.toString().equalsIgnoreCase(roastType)) {
                this.roastType = roastType;
            }
                throw new IllegalArgumentException("No such roastType " + roastType);
        }
    }

    public String getRoastType() {
        return roastType;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
