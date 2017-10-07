import java.util.*;

public class Main {

    public static void main(String[] args) {
//        new Thread(() -> System.out.println("From runnable")).start();

        Employee john = new Employee("dasdasd", 23);
        Employee john2 = new Employee("dxczcxzx", 33);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(john2);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) ->
            employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
