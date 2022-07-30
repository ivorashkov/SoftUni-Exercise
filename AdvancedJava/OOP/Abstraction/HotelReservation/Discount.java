package AdvancedJava.OOP.Abstraction.HotelReservation;

public enum Discount {
    VIP(0.8), // -20%
    SECOND_VISIT(0.9), // -10%
    NONE(1);

    private double priceReductionFactor;

    Discount(double priceReductionFactor) {
        this.priceReductionFactor = priceReductionFactor;
    }

    public double getPriceReductionFactor() {
        return priceReductionFactor;
    }

    public static Discount parse(String str) {
        if (str.equals("VIP")){
            return VIP;
        }else if (str.equals("SecondVisit")){
            return SECOND_VISIT;
        }else if (str.equals("None")){
            return NONE;
        }else{
            throw new IllegalArgumentException("Unknown enum value " + str);
        }
    }
}
