package AdvancedJava.OOP.ExamOOP.christmasRaces.io;

import AdvancedJava.OOP.ExamOOP.christmasRaces.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
