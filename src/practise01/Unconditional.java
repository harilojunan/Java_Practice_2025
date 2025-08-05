package practise01;

public class Unconditional {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("Hi "+i);
		}
		System.out.println("Bye");

	}

}
