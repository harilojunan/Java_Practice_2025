package practise01;

class Parenttt{
	
//	public Parenttt() {
//		//super();
//		System.out.println("Parent constructor");
//	}
//	
//	public Parenttt(String val) {
//		//Constructor call must be the first statement in a constructor
//		System.out.println("in parent param "+val);
//	}
	
	int a  = 15;
	public void display() {
		System.out.println("In parent display");
	}
}

class Childdd extends Parenttt{
	
//	public Childdd() {
//		//super();
//		System.out.println("Child constructor");
//	}
//
//	public Childdd(int i) {
//		//Constructor call must be the first statement in a constructor
//		super("test");
//		System.out.println("in child param "+i);
//	}
	
	int a = 25;
	public void display() {
		super.display();
		System.out.println("In child display");
		System.out.println("a = "+a);
		System.out.println("a = "+super.a);
	}
	
}

/*
 *  Super Keyword:-
 *  1. Achieved by Inheritance concept
 *  2. Used to access immediate parent class variables, methods and constructors from child class
 *  
 *  Note : Name of Base class and derived class variables, methods and constructors should be same
 */

public class SuperKeywordDemo {

	public static void main(String[] args) {
//		Childdd obj = new Childdd(10);
		Childdd obj = new Childdd();
		obj.display();

	}

}
