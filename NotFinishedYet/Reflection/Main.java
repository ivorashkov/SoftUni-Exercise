package NotFinishedYet.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InstantiationException,
                                    IllegalAccessException, ClassNotFoundException,
                                    NoSuchMethodException, InvocationTargetException {

        Class clazz = Class.forName("NotFinishedYet.Reflection.Reflection");
        System.out.println(clazz);//default toString is used here.
        System.out.println(clazz.getSuperclass());//base class

        Class[] interfaces = clazz.getInterfaces();
        for (Class c: interfaces) {
            System.out.println(c);
        }

        Constructor constructor = clazz.getDeclaredConstructor();
        Object newInstance = constructor.newInstance();

        System.out.println(newInstance);

    }
}
