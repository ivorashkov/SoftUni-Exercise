package AdvancedJava.OOP.ExamOOP.zoo;

import AdvancedJava.OOP.ExamOOP.zoo.core.Engine;
import AdvancedJava.OOP.ExamOOP.zoo.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
