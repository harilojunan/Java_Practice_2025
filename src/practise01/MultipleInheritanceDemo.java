package practise01;

interface Parent1{
	void display();
}

interface Parent2{
	void show();
}

class Parent3{
	void view() {
		System.out.println("In view method test");
	}
}

//Initially extends then implements : That is the correct order
class Child extends Parent3 implements Parent1, Parent2{

	@Override
	public void show() {
		System.out.println("In show method");
	}

	@Override
	public void display() {
		System.out.println("In display method");	
	}
	
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.show();
		obj.view();
	}
}
