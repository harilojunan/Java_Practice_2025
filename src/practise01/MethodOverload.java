package practise01;

class Overload{
	
	int num1;
	int num2;
	int result;
	
	void sum(int a, int b) {
		num1 = a;
		num2 = b;
		result = num1 + num2;
		System.out.println(result);
	}
	
	void sum(double a, double b) {
		num1 = (int)a;
		num2 = (int)b;
		result = num1 + num2;
		System.out.println(result);
		
	}

	void sum(int a, double b) {
		num1 = a;
		num2 = (int)b;
		result = num1 + num2;
		System.out.println(result);
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		/*
		 * Polymorphism (Same thing in diff. ways)
		 * --> Compile time (Method Overloading)
		 * --> Run time (Method Overriding)
		 */
		
		Overload obj = new Overload();
		obj.sum(10,20);
		obj.sum(10.2,20.5);
		obj.sum(10,20.6);

	}

}
