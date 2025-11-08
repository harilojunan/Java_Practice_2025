package practise01;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class EmployeePerson {
	private final int id;
	private final String name;
	private final Department department;
	
	public EmployeePerson(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	
	public Department getDepartment() {
		return department;
	}
	
}

class Department {
	private final int id;
	private final String name;
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department dept = (Department) obj;
		return id == dept.id && Objects.equals(name, dept.name);
	}
	
}

public class StreamListConvertToMap {
	public static void main(String... args) {
		
		Department hr = new Department(1, "HR");
		Department finance = new Department(2, "Finance");
		Department it = new Department(3, "IT");
		
		List<EmployeePerson> employees = List.of(
			new EmployeePerson(101, "Peter", it),
			new EmployeePerson(102, "Steve", hr),
			new EmployeePerson(103, "Natasha", it),
			new EmployeePerson(104, "Bruce", finance),
			new EmployeePerson(105, "Tony", finance)			
		);
		
		Map<Department, List<EmployeePerson>> mapResult = employees.stream().collect(Collectors.groupingBy(EmployeePerson::getDepartment));
		
		mapResult.forEach((dept, empList) -> {
			System.out.println("Department: " + dept.getName());
			empList.forEach(e -> System.out.println(" " + e.getName()));
		});
	}
}
