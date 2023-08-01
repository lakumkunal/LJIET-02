package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int empid;
    private String name;
    private double salary;

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empid + ", Name: " + name + ", Salary: " + salary + ")";
    }
}

class EmployeeComparator implements Comparator<Employee> {
    private String sortKey;

    public EmployeeComparator(String sortKey) {
        this.sortKey = sortKey;
    }

    @Override
    public int compare(Employee emp1, Employee emp2) {
        switch (sortKey) {
            case "empid":
                return Integer.compare(emp1.getEmpid(), emp2.getEmpid());
            case "name":
                return emp1.getName().compareTo(emp2.getName());
            case "salary":
                return Double.compare(emp1.getSalary(), emp2.getSalary());
            default:
                throw new IllegalArgumentException("Invalid sorting key. Choose from empid, name, or salary.");
        }
    }
}

public class sortedEmpData {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new Employee(101, "harry", 50000));
        employees.add(new Employee(102, "Smith", 55000));
        employees.add(new Employee(103, "maya", 48000));

        // Sorting based on user choice (empid, name, or salary)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sorting key (empid, name, salary): ");
        String userChoice = scanner.next().toLowerCase();

        switch (userChoice) {
            case "empid":
            case "name":
            case "salary":
                Collections.sort(employees, new EmployeeComparator(userChoice));
                System.out.println("Sorted Employees:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            default:
                System.out.println("Invalid sorting key. Choose from empid, name, or salary.");
                break;
        }
    }
}
