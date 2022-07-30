package FundamentalsBasicSyntax.ClassAndObject;

import java.util.*;

public class Students_2 {

    static class Student {
        private String firstName;
        private String lastName;
        private double grade;

        Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        double getGrade() {
            return this.grade;
        }

        String getInfo(){
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studCount = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studCount; i++) {
            List<String> information = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
            students.add(new Student(information.get(0), information.get(1), Double.parseDouble(information.get(2))));
        }

        //{listName}.sort(Comparator.comparing({ClassName}::{getMethodName}));
        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);

        for (Student stud:students) {
            System.out.println(stud.getInfo());
        }
    }
}
