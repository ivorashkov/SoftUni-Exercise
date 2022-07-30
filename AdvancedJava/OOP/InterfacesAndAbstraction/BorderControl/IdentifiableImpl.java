package AdvancedJava.OOP.InterfacesAndAbstraction.BorderControl;

public abstract class IdentifiableImpl implements Identifiable{

    private String id;

    protected  IdentifiableImpl(String id){
        this.id = id;
    }

    /** identifiable **/
    @Override
    public String getId() {
        return this.id;
    }


}
