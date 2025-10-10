package practise01;

abstract class Employee{
	abstract void display();
	
	void show() {
		System.out.println("Abstract show");
	}
}

class Servant extends Employee{
	void display() {
		System.out.println("Abstract method in Derived class");
	}
}


public class AbstractionDemo {

	public static void main(String[] args) {
		/*
		 * Abstraction (abstract)
		 * -> Abstract method (method having only declaration)
		 * -> Definition will be written in Derived class
		 * -> Abstract class (contains atleast one abstract method)
		 * -> Concrete class (class which doesn't contain any abstract method)
		 * -> We cannot create object for abstract class
		 */
		Servant obj = new Servant();
		obj.display();
		obj.show();
	}

}
