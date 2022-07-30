package AdvancedJava.Advanced.GenericArrayCreator.GenericBox;

public class GenericBox<E> {
    private E element;

    public GenericBox(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass().getName() + ": " + element;
    }
}
