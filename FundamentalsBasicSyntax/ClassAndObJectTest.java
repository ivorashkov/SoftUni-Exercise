package FundamentalsBasicSyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassAndObJectTest {
    //defining Class-object
/*    class Circle {
        private double radius;
        private double area;

        //constructor
        Circle(double radius) {
            this.setRadius(radius);
        }

        //setter
        void setRadius(double radius) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
        }

        //getter
        double getRadius() {
            return this.radius;
        }

        //getter
        String getInfo() {
            return "Circle R=" + this.radius + ", A=" + this.area;
        }
    }*/
    /* static class StudentTest {
         //Object class

         String name;
         int id;
         int age;

         StudentTest() {
             //Overloading the constructor by creating new one without params
             this.name = "Unknown";
             this.id = -1;
             this.age = -1;
         }

         StudentTest(String name, int id, int age) {
             //constructor ->Same name as the Class without return type
             this.name = name;
             this.id = id;
             this.age = age;
         }

         String getName() {
             return this.name;
         }

         void setName(String name) {
             this.name = name;
         }

         void increaseAge() {
             this.age++;
         }

         String getInfo() {
             return "ID:" + this.id + ", age: " + this.age + ", name:" + this.name;
         }
     }
 */
    static class Student {
        //слагаме private променливите за да не могат да се достъпват директно
        //отвън, а само чрез конструктора
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        boolean isFrom(String city) {
            //сравнява града на обекта с града подаден като параметър
            return this.city.equals(city);
        }

        String getInfo() {
            return String.format("%s %s is %d years old.", this.firstName, this.lastName, this.age);
        }

        String getFirstName() {
            return this.firstName;
        }

        String getLastName() {
            return this.lastName;
        }

        void setAge(int age){
            this.age = age;
        }

        void setCity(String city){
            this.city=city;
        }


    }

    public static void main(String[] args) {
        //лист от указатели към адреси в паметта, които сочат към обектите
        List<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] studentParameters = line.split("\\s+");
            String firstName = studentParameters[0];
            String lastName = studentParameters[1];
            int age = Integer.parseInt(studentParameters[2]);
            String city = studentParameters[3];


            /*int index = indexOfStudent(students, firstName, lastName);
            if (index == -1) {
                students.add(new Student(firstName, lastName, age, city));
            } else {
                  //заместваме целия елемент на дадения индекс
                students.set(index, new Student(firstName, lastName, age, city));
            }*/

            //existing е адрес в паметта, който сочи към намерения обект
            Student existing = findStudent(students, firstName, lastName);
            if (existing==null){
                students.add(new Student(firstName, lastName, age, city));
            }else{
                //променяме самия обект като добавяме различните стойности
                existing.setAge(age);
                existing.setCity(city);
            }



            line = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }

    }

    private static Student findStudent(List<Student> students, String firstName, String lastName){
        //проверка за обект, връщаме обект
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);//s присвоява обекта за дадения индекс
            if (s.getFirstName().equals(firstName)
                    && s.getLastName().equals(lastName)) {
                return s;
            }
        }
        return null;
    }

    private static int indexOfStudent(List<Student> students, String firstName, String lastName) {
        //Проверка по индекс
        //въртим цикъл през лист от обекти и проверяваме по стойност
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);//s присвоява обекта за дадения индекс
            if (s.getFirstName().equals(firstName)
                    && s.getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }

}
