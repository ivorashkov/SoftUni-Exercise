package FundamentalsBasicSyntax;

import java.util.*;
import java.util.function.ToDoubleFunction;


public class MapWithListOfObj {

    static class Student {
        String firstName;
        String lastName;
        String facNumber;
        List<Double> grades;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFacNumber() {
            return facNumber;
        }

        public void setFacNumber(String facNumber) {
            this.facNumber = facNumber;
        }

        public List<Double> getGrades() {
            return grades;
        }

        public void setGrades(int grades) {
            this.grades.add(grades * 1.0);
        }

/*      public double getAverage(){
            double average = this.grades.stream().mapToDouble(Double::parseDouble).average().getAsDouble();
            return average;
        }*/

        public Student() {
        }

        public Student(String firstName, String lastName, String facNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.facNumber = facNumber;
            this.grades = new ArrayList<>();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Math, List<Student>
        Map<String, List<Student>> studsMap = new HashMap<>();
        //Biologiq, List<Studenti>
        //Matematika, List<Studenti>
        //Himiq, List<Studenti>
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            String[] info = input.split(",\\s+");
            String subject = info[0];
            String firstName = info[1];
            String lastName = info[2];
            String facNumber = info[3];
            int grade = Integer.parseInt(info[4]);

            List<Student> subjectInfo = studsMap.get(subject);//NULL

            if (subjectInfo != null) {
                //todo tuka dobavqme kogato subjecta e sushtestvuvasht
                //List<Student> currentStudent = studsMap.get(subject);

                boolean notExisting = true;
                Student student = new Student();
                for (Student s : subjectInfo) {//ivo venci kolio
                    if (Objects.equals(s.getFacNumber(), facNumber)) {
                        notExisting = false;
                        student = s;
                    }
                }
                if (notExisting) {
                    studsMap.get(subject).add(new Student(firstName, lastName, facNumber));
                    studsMap.get(subject).get(studsMap.get(subject).size() - 1).setGrades(grade);
                } else {
                    student.setGrades(grade);
                }

            } else {
                studsMap.put(subject, new ArrayList<>());
                studsMap.get(subject).add(new Student(firstName, lastName, facNumber));
                //добавяме оценка на последния/текущия/ студент от листа
                studsMap.get(subject).get(studsMap.get(subject).size() - 1).setGrades(grade);
            }
            input = scanner.nextLine();
        }

  /*    for (Map.Entry<String,List<Student>>entry :studsMap.entrySet()) {
            System.out.println(entry.getKey());
            List<Student> currentClass = entry.getValue();
            for (Student student:currentClass) {
                List<Double>grades = student.getGrades();
                System.out.printf("%s %s %s%n",student.getFirstName(), student.getLastName(), student.getFacNumber());
                for (double grade:grades) {
                    System.out.print(grade + " ");
                    System.out.println();
                }
            }*/

        for (Map.Entry<String, List<Student>> entry : studsMap.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().stream().forEach(student -> {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(student.getFirstName()).append(" ")
                        .append(student.getLastName()).append(" ")
                        .append(student.getFacNumber()).append(" ")
                        .append(student.getGrades().toString().replaceAll("[\\[\\],]", " "));
                System.out.println(stringBuilder);
            });
        }
    }
}

/*

      Matematika, Ivaylo, Rashkov, 12345, 3
        Matematika, Nikola, Rashkov, 34526, 5
        Matematika, Nikola, Rashkov, 34526, 6
        Matematika, Ivaylo, Rashkov, 12345, 2
        Biologiq, Ivaylo, Rashkov, 12345, 3
        Biologiq, Nikola, Rashkov, 34526, 5
        Biologiq, Nikola, Rashkov, 34526, 6
        Biologiq, Ivaylo, Rashkov, 12345, 2
        STOP
*/
