package NotFinishedYet.TEST_ENUM;

public enum CoffeeRoastType {
    BAKED(2.0),
    RAW(1.50),
    BURNT(0.50);

    private double price;

    CoffeeRoastType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
