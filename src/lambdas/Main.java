package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("Jan", 23);
        Employee john2 = new Employee("Stasiek", 33);
        Employee john3 = new Employee("Wladek", 18);
        Employee john4 = new Employee("Slawek", 43);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(john2);
        employees.add(john3);
        employees.add(john4);

        System.out.println("Employees older than 30");

        employees.forEach(employee -> {
            if (employee.getAge() > 30)
                System.out.println(employee.getName());
        });

        System.out.println("\nEmployees 30 and younger");

        employees.forEach(employee -> {
            if (employee.getAge() <= 30)
                System.out.println(employee.getName());
        });

//        for (Employee employee : employees) {
//            if(employee.getAge() > 30) {
//                System.out.println(employee.getName());
//            }
//        }
    }
}
