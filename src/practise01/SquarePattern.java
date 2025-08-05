package practise01;

public class SquarePattern {

	public static void main(String[] args) {

/*
 		0 1 2 3 
 	 0 	* * * *
 	 1 	* * * *
 	 2 	* * * *
 	 3 	* * * *
 	 4 	* * * *
 	
 */

		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
