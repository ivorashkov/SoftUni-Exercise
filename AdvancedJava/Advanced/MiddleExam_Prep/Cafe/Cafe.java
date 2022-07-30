package AdvancedJava.Advanced.MiddleExam_Prep.Cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        if (this.employees.size() < this.capacity){
            this.employees.add(employee);
        }
    }

    public boolean removeEmployee(String name){
        for (Employee emp: employees) {
            if (emp.getName().equals(name)){
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }

    public Employee getOldestEmployee(){
      return employees.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
    }

    public Employee getEmployee(String name){
        return this.employees.stream().filter(e -> e.getName().equals(name)).findAny().orElse(null);
    }

    public int getCount(){
        return this.employees.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Employees working at Cafe" + this.name);
        employees.forEach(e->sb.append(System.lineSeparator() + e.toString()));
        return sb.toString();
    }



}
