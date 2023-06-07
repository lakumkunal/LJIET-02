package employee;

import java.util.*;

class Employee
{
	private static int count = 0;
	private int empId;
	private String empName;
	
	public static int getCount() 
	{
		return count;
	}

	public Employee()
	{
		count++;
	}

	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	public void setData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		empId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Name: ");
		empName = sc.nextLine();
	}
	
}

public class Employee_object
{

	public static void main(String[] args) 
	{
		Employee emp[] = new Employee[5];
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			emp[count] = new Employee();
			emp[count].setData();
			count++;
			
			if(count == 5) 
			{
				break;
			}
			
			System.out.println("Do you want to enter details for another student? (yes/no): ");
		}while(sc.nextLine().equalsIgnoreCase("yes"));
		
		System.out.println("Total count of Employee's are: " + Employee.getCount());
	}

}

