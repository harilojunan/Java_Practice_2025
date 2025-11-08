package java_21;

sealed interface Vehicle permits Bike, Car,Truck {
}

non-sealed class Bike implements Vehicle {
	int wheels = 2;
}

non-sealed class Car implements Vehicle {
	int wheels = 4;
}

non-sealed class Truck implements Vehicle {
	int wheels = 6;
}

public class PatternMatchingSwitch {
	
	public static void main(String... args) {
		Vehicle vehicle = new Car();
		
		// ------------------------------
        // Normal switch (before Java 17)
        // ------------------------------
		System.out.println("=== Normal Switch ===");
		switch (vehicle.getClass().getSimpleName()) {
		case "Bik":
			Bike bike = (Bike) vehicle;
			System.out.println("Bike has " + bike.wheels + " wheels");
			break;
		case "Car":
			Car car = (Car) vehicle;
			System.out.println("Car has " + car.wheels + " wheels");
			break;
		case "Truck":
			Truck Truck = (Truck) vehicle;
			System.out.println("Truck has " + Truck.wheels + " wheels");
			break;
		default:
			System.out.println("Unknown Vehicle");
			break;	
		}
		
		// -----------------------------------
        // Pattern Matching switch (Java 21+)
        // -----------------------------------
        System.out.println("\n=== Pattern Matching Switch (Java 17) ===");
//        switch (vehicle) {
//        case Bike bike -> System.out.println("Car has " + bike.wheels + " wheels");
//        case Car car -> System.out.println("Car has " + car.wheels + " wheels");
//        case Truck truck -> System.out.println("Car has " + truck.wheels + " wheels");
//        default -> System.out.println("Unknown Vehicle");
        
//        }
	}

}
