package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

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

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge() <= 30);
        printEmployeesByAge(employees, "Employees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate intp = i -> i > 15;
        System.out.println(intp.test(10));

    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);

        for (Employee employee: employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
