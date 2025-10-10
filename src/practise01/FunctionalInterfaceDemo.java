package practise01;

@FunctionalInterface
interface MyInterface{
	//Only one method
	void display();
}

//class MyInterfaceImpl implements MyInterface{
//
//	@Override
//	public void display() {
//		System.out.println("In display");
//	}
//}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//Anonymous Inner class
		MyInterface obj = new MyInterface() {
			public void display() {
				System.out.println("In display");
			}
		};
		obj.display();

	}
}
