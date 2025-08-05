package practise01;

class Demo{
//	instance variables, methods
	private int age = 35;

	public int getAge() {
		return age;
	}

	public void setAge(int value) {
		System.out.println("age changed to "+value);
		this.age = value;
	}	
	
}

public class Encapsulation {
	
	// Encapsulation means binding data members and methods into single unit.

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.setAge(27);
		System.out.println(obj.getAge());
	}

}
