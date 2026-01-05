package Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
	private String name;
	private String department;
	private int salary;
	
	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary; 
	}
	
	public String getDepartment() {
		return department;
	}
	 
}

public class test01 {

	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Test01", "HR", 65000),
				new Employee("Test02", "IT", 95000),
				new Employee("Test01", "Finance", 45000),
				new Employee("Test01", "IT", 85000),
				new Employee("Test01", "HR", 60000),
				new Employee("Test01", "IT", 90000),
				new Employee("Test01", "Finance", 50000)
				);
		
		Map<String, Integer> departmentSalarySum = new HashMap<>();
		
		

	}

}
