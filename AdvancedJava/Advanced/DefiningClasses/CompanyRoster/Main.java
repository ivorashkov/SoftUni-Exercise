package AdvancedJava.Advanced.DefiningClasses.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentInfo = new HashMap<>();
        while (lines-- > 0) {
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String department = info[3];

            Employee employee = null;
            if (info.length == 4) {
                employee = new Employee(name, salary, position, department);

            } else if (info.length == 5) {
                String emailOrAge = info[4];

                if (emailOrAge.matches("\\d+")) {
                    int age = Integer.parseInt(emailOrAge);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    employee = new Employee(name, salary, position, department, emailOrAge);
                }

            } else if (info.length == 6) {
                String email = info[4];
                int age = Integer.parseInt(info[5]);

                employee = new Employee(name, salary, position, department, email, age);
            }

            Department empDepartment = departmentInfo.get(department);
            if (empDepartment != null) {
                //adding new employee to the department;
                empDepartment.getEmployees().add(employee);

            } else {
                //creating new department
                empDepartment = new Department(department, new ArrayList<>());
                empDepartment.getEmployees().add(employee);
                departmentInfo.put(department, empDepartment);
            }
        }

        String name = departmentInfo.entrySet().stream()
                .max(Comparator.comparingDouble(e -> e.getValue().calculateAverageSalary()))
                .get().getKey();

        System.out.printf("Highest Average Salary: %s%n", name);
        Department d = departmentInfo.get(name);
        List<Employee> e = d.getEmployees();
        e.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(o -> System.out.println(o.getInfo()));

    }
}
