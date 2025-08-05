package practise01;

public class Conditional {

	public static void main(String[] args) {
		/*
		int a = 5;
		int b = 3;
		
		if(a>b){
			System.out.println("a is grater than b");
		}
		*/
		
		/*
		int age = 16;
		if(age > 18) {
			System.out.println("ELIGIBLE TO VOTE");
		}
		else {
			System.out.println("NOT ELIGIBLE");
		}
		*/
		
		/*
		int num = 9;
		if(num%2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		*/
		
		/*
		// Nested if
		int mark;
		mark = 90;
		if(mark>35) {
			if(mark>80) {
				System.out.println("He is a Monitor");
			}
			else {
				System.out.println("He is not a Monitor");
			}
		}
		else {
			System.out.println("Sorry He is fail");
		}
		System.out.println("Bye");
		*/
		
		/*
		//else if ladder
		int a = 5;
		int b = 5;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a and b both are equal");
		}
		*/
		
		//Switch
		int n = 3;
		switch(n)
		{
		case 1:
			System.out.println("Ceiling fan");
			break;
		case 2:
			System.out.println("Table fan");
			break;
		case 3:
			System.out.println("Tube light");
			break;
		case 4:
			System.out.println("No watts lamp");
			break;
		default:
			System.out.println("Invalid switch");
		}
		System.out.println("Bye");
	}

}
