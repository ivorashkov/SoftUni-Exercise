package AdvancedJava.OOP.InterfacesAndAbstraction.BorderControl;

public class Robot extends IdentifiableImpl {

    private String id;
    private String model;

    public Robot(String id, String model) {
        super(id);
        this.model = model;
    }

    public String getModel() {
        return model;
    }


}
