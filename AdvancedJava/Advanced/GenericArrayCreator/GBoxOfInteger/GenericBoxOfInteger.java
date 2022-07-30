package AdvancedJava.Advanced.GenericArrayCreator.GBoxOfInteger;

public class GenericBoxOfInteger<E> {
    private E element;

    public GenericBoxOfInteger(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass().getName() + ": " + element;
    }
}
