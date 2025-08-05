package practise01;

class Student{
	// variable(data members)
	// methods
	
	String name;
	int age;
	
	void display() {
		System.out.println("Student Name = "+name);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Mahela";
		s1.age = 26;
		s1.display();
		
		Student s2 = new Student();
		s2.name = "Chamara";
		s2.age = 36;
		s2.display();

	}

}
