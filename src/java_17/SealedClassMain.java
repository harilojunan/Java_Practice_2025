package java_17;

sealed abstract class Vehicle permits Car, Truck {
	public abstract String type();
}

// 3 things to consider while creating subclass for sealed class

// final, sealed ad non-sealed class only

//final class Bike extends Vehicle {
//
//	@Override
//	public String type() {
//		return null;
//	}
//}

final class Car extends Vehicle {

	@Override
	public String type() {
		return "I am a Car";
	}
}

non-sealed class Truck extends Vehicle {

	@Override
	public String type() {
		return "I am a Truck";
	}
}


public class SealedClassMain {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		
		System.out.println("Car : "+car.type());
		System.out.println("Truck : "+truck.type());

	}

}
