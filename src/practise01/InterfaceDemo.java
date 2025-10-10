package practise01;

interface A{
	//method only abstract method
	//variable static and final
	int age = 22; // static and final
	void show(); // public abstract
}

class Aimple implements A{

	@Override
	public void show() {
		System.out.println("In show");	
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		/*
		 * Interface Basics
		 * Multiple Inheritance support with Interface
		 * Types of interface
		 * i) Normal Interface
		 * ii) Functional Interface with lambda expression
		 * iii) Marker Interface (Serializable)
		 */
		
		Aimple obj = new Aimple();
		obj.show();
		
		System.out.println(A.age);

	}

}
