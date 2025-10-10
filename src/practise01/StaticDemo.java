package practise01;

class Students{
	String name;
	int age;
	static String teacher;
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Teacher : "+teacher);
	}
	//Static block
	static {
		Students.teacher = "Uthayakumari";
	}
}

public class StaticDemo {

	public static void main(String[] args) {

		Students s1 = new Students();
		s1.name = "Piratha";
		s1.age = 26;
		//static can call with class
//		Students.teacher = "Uthayakumari";
		//static can call with object
//		s1.teacher = "Uthayakumari";
		s1.display();
		Students s2 = new Students();
		s2.name = "Powshi";
		s2.age = 27;
		s2.display();

	}

}
