package FundamentalsBasicSyntax.MapAndStream;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentInfo = new LinkedHashMap<>();
        int addingStudentInfo =  Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < addingStudentInfo; i++) {
            String studentName = scanner.nextLine();
            double grade =  Double.parseDouble(scanner.nextLine());

            if (studentInfo.get(studentName) != null){
                studentInfo.get(studentName).add(grade);
            }else{
                studentInfo.put(studentName, new ArrayList<>());
                studentInfo.get(studentName).add(grade);
            }

        }

        for (Map.Entry<String,List<Double>>entry:studentInfo.entrySet()) {


            List<Double> grades = entry.getValue();
            double currentGrade=0;
            for (Double grade:grades) {
                currentGrade += grade;
            }

            double result = currentGrade / grades.size();

            if (result >= 4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),result);
            }
        }
    }
}
