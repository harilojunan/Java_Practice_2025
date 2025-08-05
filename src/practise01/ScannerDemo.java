package practise01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.println("Enter your temperature :");
		double temp = sc.nextDouble();
		
		System.out.println("Name : " +name);
		System.out.println("Age : " + age);
		System.out.println("Temperature : " + temp);
		
		sc.close();

	}

}
