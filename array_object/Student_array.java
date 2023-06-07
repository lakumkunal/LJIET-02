package array_object;
import java.util.Scanner;


class Student{
	static Scanner sc =  new Scanner(System.in);
	int rollNo;
	String name;
	float marks;
	
	public void setData() {
		System.out.println("Enter the roll no:");
		this.rollNo = sc.nextInt();
		System.out.println("Enter the name:");
		this.name = sc.next();
		System.out.println("Enter the marks:");
		this.marks = sc.nextFloat();
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

class Employee{
	static Scanner sc =  new Scanner(System.in);
	static int COUNT = 0;
	int id , salary;
	String name;
	public void setData() {
		System.out.println("Enter the id:");
		this.id = sc.nextInt();
		System.out.println("Enter the name:");
		this.name = sc.next();
		System.out.println("Enter the salary:");
		this.salary = sc.nextInt();
		
		Employee.COUNT++;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}
public class Student_array{
	public static void main(String[] args) {
		System.out.println("getting values for Students array -->");
		Student [] students = new Student[5];
		int i = 0;
		do {
			students[i] = new Student();
			students[i].setData();
			i++;
		}while(i < students.length);
		
		System.out.println("printing values of Students array -->");
		for(Student s : students) {
			System.out.println(s);
		}
		
		
		System.out.println("getting values for Employee array -->");
		Employee [] employees = new Employee[5];
		for(i = 0 ; i < employees.length ; i++) {
			employees[i] = new Employee();
			employees[i].setData();
		}
		
		System.out.println("printing values of Employee array -->");
		for(Employee e : employees) {
			System.out.println(e);
		}
		System.out.println("The total number of employees are :" + Employee.COUNT);
		
	}
}