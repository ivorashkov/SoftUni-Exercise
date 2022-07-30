package AdvancedJava.Advanced.SetsAndMaps;

import java.util.*;

public class AverageStudentGrades {
    static class Student {
        List<Double> grades;
        String name;
        double averageGrade;


        public List<Double> getGrades() {
            return grades;
        }

        public void setGrades(double grade) {
            this.grades.add(grade);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAverageGrade() {
            double grade = 0;
            for (double d : this.grades) {
                grade += d;
            }

            return grade / this.grades.size();
        }


        public Student(String name) {
            this.grades = new ArrayList<Double>();
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Student> studentInfoMap = new TreeMap<>();

        int studCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < studCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            Student currentStudent = studentInfoMap.get(name);

            if (currentStudent != null) {
                //sushtestvuva
                currentStudent.setGrades(grade);

            } else {
                //ne sushtestvuva
                currentStudent = new Student(name);
                currentStudent.setGrades(grade);
                studentInfoMap.put(name, currentStudent);

            }

        }

        for (Map.Entry<String, Student> entry : studentInfoMap.entrySet()) {
            Student currentStud = entry.getValue();
            System.out.print(entry.getKey() + " -> ");

            List<Double> grades = currentStud.getGrades();

            for (double g : grades) {
                System.out.printf("%.2f ",g);
            }

            System.out.printf("(avg: %.2f)%n",currentStud.getAverageGrade());


        }


    }
}
