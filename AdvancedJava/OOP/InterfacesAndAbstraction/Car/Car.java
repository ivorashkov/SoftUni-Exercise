package AdvancedJava.OOP.InterfacesAndAbstraction.Car;

import java.io.Serializable;

public interface Car extends Serializable {
    //public static final
    int TIRE = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();


}
