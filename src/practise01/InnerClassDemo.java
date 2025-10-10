package practise01;

class Outer{
	public void show() {
		System.out.println("In show method");
	}
	
	class Inner{
		public void display() {
			System.out.println("In display method");
		}
	}
	
	static class Inner2{
		public void view() {
			System.out.println("In static view method");
		}
	}
	
	private class Inner3{
		public void see() {
			System.out.println("In private view method");
		}
	}
	
	public void getAccess() {
		Inner3 inn = new Inner3();
		inn.see();
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		obj.getAccess();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		
		Outer.Inner2 obj2 = new Outer.Inner2();
		obj2.view();	

	}

}
