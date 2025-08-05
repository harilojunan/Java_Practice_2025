package practise01;

class ABCD{
//	Constructor name should be class name
//	two types of constructor 1.default constructor 2.parameterized constructor
//	never return anything
//	Used to allocate memory and initialize object
	
	int num1;
	int num2;
	int result;
	
//	Constructor overloading means same name of constructor with many usage
	//default constructor
	ABCD(){
		System.out.println("In default constructor");
	}
	
	//Parameterized constructor
	ABCD(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	void display() {
		result = num1 + num2;
		System.out.println("Results is : " + result);
	}
}

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		ABCD obj = new ABCD();  // Default constructor
		ABCD obj1 = new ABCD(20,40); // Parameterized constructor
		obj1.display();

	}

}
