package practise01;

import java.util.function.BiFunction;

public class MethodReferenceStaticMethodDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> bifunctionalAdd = MethodReferenceStaticMethodDemo::addNumbers;
		
		System.out.println(bifunctionalAdd.apply(5, 6));

	}
	
	public static Double addNumbers(Integer i, Integer j) {
		return i+j.doubleValue();

	}

}
